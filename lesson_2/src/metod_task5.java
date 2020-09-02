/*Дано любое натуральное 4-х значное число. Верно ли, что все цифры числа различны?*/

import java.util.Scanner;

public class metod_task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int i = scanner.nextInt();
        if((i%10==i%100/10)&&(i%100/10==i%1000/100)&&(i%1000/100==i/1000)){
            System.out.println("Цифры в данном числе равны между собой");
        } else {
            System.out.println("Цифры в данном числе различны");
        }
        /*System.out.print("Число в обратном порядке: "+i%10);
        System.out.print(i%100/10);
        System.out.print(i%1000/100);
        System.out.println(i/1000);*/
    }
}