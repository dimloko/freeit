package generics;

import java.util.Random;

public class BoxRunner {
    public static void main(String[] args) {
        Random random = new Random();

        //Создание объекта класса ArrBox для массива элементов типа int
        ArrBox<Integer> box1 = new ArrBox<>();

        //Инициализация 10-ти элементов случайными числами
        for (int i = 0; i < 10; i++) {
            box1.add(random.nextInt(100));
        }
        //Вывод элементов всего массива, его 1-го и 5-го элементов
        System.out.println(box1.out());
        System.out.println(box1.get(1));
        System.out.println(box1.get(5));

        //Создание объекта класса ArrBox для массива элементов типа Double
        ArrBox<Double> box2 = new ArrBox<>();
        //Инициализация 10-ти элементов случайными числами
        for (int i = 0; i < 10; i++) {
            box2.add(random.nextDouble());
        }
        //Вывод элементов всего массива, его 1-го и 5-го элементов
        System.out.println(box2.out());
        System.out.println(box2.get(1));
        System.out.println(box2.get(5));
    }
}
