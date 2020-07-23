/*Имеется целове число (задать с помощью Random rand = new Random(); int x =rand.nextInt() ).
Это число – количесво денег в рублях. Вывести это число, добавив к нему слово «рублей» в правильном падеже.*/

import java.util.Random;

public class metod_task8 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt(100000); //100000 чтобы не залазить в отрицательные значения

        //Если последняя цифра 1, исключение для 11
        if (x % 10 == 1) {
            if (x % 100 == 11) {
                System.out.println(x + " рублей");
            } else {
                System.out.println(x + " рубль");
            }
        }

        //Если последние цифры от 2 до 4 включительно, исключение для 14
        if (2 <= x % 10 && x % 10 <= 4) {
            if (x % 100 == 14||x % 100 == 12) {
                System.out.println(x + " рублей");
            } else {
                System.out.println(x + " рубля");
            }
        }

        //Если последние цифры от 5 до 9 включительно, и 0 (ноль)
        if (5 <= x % 10 && x % 10 <= 9 || x % 10 == 0) {
            System.out.println(x + " рублей");
        }
    }
}
