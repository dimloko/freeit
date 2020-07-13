//Даны 3 целых числа. Найти количество положительных чисел в исходном наборе.

import java.util.Scanner;


public class task4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] array=new int[3]; //Массив из трех элементов
        int count_plus=0; //Счётчик количества положительных чисел

        //Ввод массива и подсчёт колличества положительных чисел
        System.out.println("Введите число:");
        for(int i=0;i<3;i++){
            array[i] = scanner.nextInt();
            if (array[i]>0)
                count_plus++;
        }

        //Вывод результата
        if(count_plus==0){
            System.out.println("\nСреди чисел нет положительных");
        } else {
            System.out.println("\nПоложительных чисел: " +count_plus);
        }


    }
}