/*Напишите три цикла выполняющих многократное сложение строк, один с
помощью оператора сложения и String, другой с помощью StringBuilder и метода
append, а также аналогино для StringBuffer. Сравните скорость их выполнения.*/


public class MetodTask21 {
    public static void main(String[] args) {
        String str1 = "test"; //Объект класса String
        StringBuilder str2 = new StringBuilder("test"); //Объект класса StringBuilder
        StringBuffer str3 = new StringBuffer("test"); //Объект класса StringBuffer
        int n = 50000; //Количество операций сложения
        long time = System.nanoTime(); //Хранение времени

        //Операция сложениия
        for (int i = 0; i < n; i++) {
            str1 += "test";
        }
        time = System.nanoTime() - time;
        System.out.printf("Сложение через оператор:\t\t\t\t\t\t%6.3f ms\n", time / 1000000.0);

        //append класса StringBuilder
        time = System.nanoTime();
        for (int i = 0; i < n; i++) {
            str2.append("test");
        }
        time = System.nanoTime() - time;
        System.out.printf("Сложение методом append класса StringBuilder:\t%6.3f ms\n", time / 1000000.0);

        //append класса StringBuffer
        time = System.nanoTime();
        for (int i = 0; i < n; i++) {
            str3.append("test");
        }
        time = System.nanoTime() - time;
        System.out.printf("Сложение методом append класса StringBuffer:\t%6.3f ms\n", time / 1000000.0);
    }
}