/*В переменную записываем число. Надо вывести на экран сколько в этомчисле цифр и
положительное оно или отрицательное. Например, "этооднозначное положительное число".
Достаточно будет определить, является личисло однозначным, "двухзначным или трехзначным и более.*/

import java.util.Scanner;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");
        int i = scanner.nextInt();
        //int n=3635;

        //Проверка количества разрадов в числе
        if((0<i&&i<10)||(-10<i&&i<0)){
            System.out.print("Это однозначное");
        } else if ((10<=i&&i<100)||(-100<i&&i<=-10)){
            System.out.print("Это двухзначное");
        } else if ((100<=i&i<1000)||(-1000<i&&i<=-100)){
            System.out.print("Это трехзначное");
        }

        //Проверка на положительность/отрицательность и правильность ввода
        if(1<i&&i<1000){
            System.out.println(" положительное число");
        } else if (-1000<i&&i<-1){
            System.out.println(" отрицательное число");
        } else {
            System.out.println("Введён ноль либо четырёхзначное число");
        }
    }
}