//Найдите сумму первых n целых чисел, которые делятся на 3.

import java.util.Scanner;

public class metod_task12 {
    public static void main(String[] args) {
        //Ввод числа, если ввод некорректный - в значение переменной запишется 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число N:");
        int n = sc.hasNextInt() ? sc.nextInt() : 0;
        int sum = 0, tmp = 0; //Сумма чисел кратных трём и вспомогательная переменная

        //Подсчёт суммы первых n чисел кратных 3
        for (int i = 1; i <= n; i++) {
            tmp += 3;
            sum += tmp; //Прибавление следующего числа кратного 3 к сумме
        }

        System.out.println("Сумма первых " + n + " чисел кртаных 3 = " + sum);
    }
}

