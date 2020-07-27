/*Посчитать факториал числа в границах от 10 до 15 (не используя рекурсию).*/

import java.util.Random;

public class Metod_task10 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = 10 + rand.nextInt(5); //Генерация случайного целого числа от 10 до 15

        //Вычисление факториала
        long fact = 1;
        for (int i = 1; i <= x; i++) {
            fact *= i;
        }

        //Вывод резульатата
        System.out.println(x + "!=" + fact);
    }
}
