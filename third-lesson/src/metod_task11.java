/*Имеется целое число, определить является ли это число простым, т.е.
делится без остатка только на 1 и себя.*/

import java.util.Random;

public class metod_task11 {
    public static void main(String[] args) {
        Random rand = new Random();
        int x = rand.nextInt();
        int flag = 0; //Флаг того, что число поделилось без остатка

        //Проверка числа х на простоту
        for (int i = 2; i <= x; i++) {
            if (x % i == 0) { //Если число поделилось без остатка - увеличить флаг на 1
                flag++;
            }
            if (flag > 1) {  //Если флаг больше 1 - число не простое, прервать дальнейшее итерации цикла
                break;
            }
        }

        //Вывод результата
        if (flag == 1) {
            System.out.println("Число " + x + " - простое");
        } else {
            System.out.println("Число " + x + " не является простым");
        }

    }
}
