/*Составьте программу, вычисляющую A*B, не пользуясь операцией умножения.*/

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        //Ввод числа, если ввод некорректный - в значение переменной запишется 0
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число A:");
        int a = sc.hasNextInt() ? sc.nextInt() : 0;
        System.out.println("Введите число B:");
        int b = sc.hasNextInt() ? sc.nextInt() : 0;

        int result = 0; //Результат "умножение"

        //"Умножение"
        for (int i = 1; i <= b; i++) {
            result += a;
        }

        //Вывод результата
        System.out.println("Результат \"умножения\" A*B= " + result);
    }
}
