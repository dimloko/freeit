/*Определить число, полученное выписыванием в обратном порядке цифр
любого 4-х значного натурального числа n.*/

import java.util.Scanner;

public class metod_task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int i = scanner.nextInt();
        System.out.print("Число в обратном порядке: "+i%10);
        System.out.print(i%100/10);
        System.out.print(i%1000/100);
        System.out.println(i/1000);
    }
}
