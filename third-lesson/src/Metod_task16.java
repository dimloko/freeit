/*Определите сумму элементов одномерного массива, расположенных между
минимальным и максимальным значениями. */


import java.util.Random;
import java.util.Scanner;

public class Metod_task16 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int sum = 0, i_min = 0, i_max = 0; //Сумма элементов, индексы минимального и максимального элементов

        //Ввод размерности массива
        System.out.println("Введите размер массива:");
        int n = sc.hasNextInt() ? sc.nextInt() : 10;
        int array[] = new int[n];

        //Генерация массива и его вывод, поиск минимального и максимального значений
        System.out.println("Исходный массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(20);
            System.out.printf("array[%d]=%2d%n", i, array[i]);
            if (array[i] > array[i_max]) {
                i_max = i;
            }
            if (array[i] < array[i_min]) {
                i_min = i;
            }
        }
        System.out.printf("%nMAX array[%d]=%2d%n", i_max, array[i_max]);
        System.out.printf("MIN array[%d]=%2d%n%n", i_min, array[i_min]);

        if (i_min < i_max) { //Сумма элементов между i_min и i_max при условии что i_min меньше i_max
            for (int i = i_min; i <= i_max; i++) {
                sum += array[i];
            }
            System.out.printf("Сумма элементов с %d по %d равна %d%n", i_min, i_max, sum);
        } else { //Сумма элементов между i_min и i_max при условии что i_min больше i_max
            for (int i = i_max; i <= i_min; i++) {
                sum += array[i];
            }
            System.out.printf("Сумма элементов с %d по %d равна %d%n", i_max, i_min, sum);
        }
    }
}
