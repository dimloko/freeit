/*Дано целое число. Если оно является положительным, то прибавить к нему 1.
Если отрицательным, то вычесть из него 2. Если нулевым, то заменить его на10.
Вывести полученное число*/

import java.util.Scanner;

public class task3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int i = scanner.nextInt();
        if(i>0){
            i+=1;
            System.out.println(i);
        }
        if(i<0){
            i-=2;
            System.out.println(i);
        }
        if(i==0){
            i=10;
            System.out.println(i);
        }
    }
}
