//Даны 3 целых числа. Найти количество положительных и отрицательныхчисел в исходном наборе

import java.util.Scanner;

public class task5 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int [] array=new int[3]; //Массив из трех элементов
        int count_plus=0, count_minus=0; //Счётчик количества положительных и отрицательных чисел

        //Ввод массива и подсчёт колличества положительных и отрицательных чисел
        System.out.println("Введите число:");
        for(int i=0;i<3;i++){
            array[i] = scanner.nextInt();
            if (array[i]>0)
                count_plus++;
            if (array[i]<0)
                count_minus++;
        }

        //Вывод результата
        if(count_plus==0&&count_minus==0){
            System.out.println("\nСлишком много нулей");
        } else {
            System.out.println("\nПоложительных чисел: " +count_plus);
            System.out.println("\nОтрицательных чисел: " +count_minus);
        }


    }
}
