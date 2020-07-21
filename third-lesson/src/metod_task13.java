//Создать последовательность случайных чисел, найти и вывести наибольшее из них

import java.util.Random;
import java.util.Scanner;

public class metod_task13 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int i_max = 0;//Индекс максимального элемента массива

        //Ввод размерности массива
        System.out.println("Введите размер массива:");
        int n = sc.hasNextInt() ? sc.nextInt() : 10;
        int array[] = new int[n];

        //Генерация массива, его вывод и поиск максимального элемента
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(30);
            System.out.printf("array[%d]=%d%n", i, array[i]);
            if (array[i] > array[i_max]) {
                i_max = i;
            }
        }

        //Вывод результата
        System.out.printf("%nМаксимальный элемент массива array[%d]=%d%n", i_max, array[i_max]);
    }
}
