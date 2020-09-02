package annotation;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MyServiceRunner {
    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        inspectService(MyService.class);
        inspectService(String.class);

    }

    static void inspectService(Class<?> service) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        if (service.isAnnotationPresent(Version.class)) {
            Version ann = service.getAnnotation(Version.class);
            System.out.println("Annotation found in the " + service.getName() + " class:\n" + ann);

            //Создание объекта класса MyService
            Class<?> c = Class.forName(MyService.class.getName());
            Object obj = c.newInstance();
            MyService test = (MyService) obj;

            //Получение доступа к переменной private varInt
            Field field = test.getClass().getDeclaredField("varInt");
            field.setAccessible(true);
            System.out.println("Field state:\n" + field.get(test));
            field.set(test, 5);
            System.out.println("Field state:\n" + field.get(test));

            //Получение доступа к private методу thisClassInfo
            Method method = test.getClass().getDeclaredMethod("thisClassInfo");
            method.setAccessible(true);
            method.invoke(test);


        } else {
            System.out.println("\n\n***In class " + service.getName() + " annotation not found***\n\n");
        }
    }
}
