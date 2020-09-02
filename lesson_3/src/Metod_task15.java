/*Создать массив, заполнить его случайными элементами, распечатать,
перевернуть, и снова распечатать (при переворачивании нежелательно создавать
еще один массив).*/

import java.util.Random;
import java.util.Scanner;

public class Metod_task15 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int tmp = 0;//Переменная для временного хранения значения элемента массива при "переворачивании"

        //Ввод размерности массива
        System.out.println("Введите размер массива:");
        int n = sc.hasNextInt() ? sc.nextInt() : 10;
        int array[] = new int[n];

        //Генерация массива и его вывод
        System.out.println("Исходный массив");
        for (int i = 0; i < array.length; i++) {
            array[i] = rand.nextInt(10);
            System.out.printf("%2d", array[i]);
        }
        System.out.println("");

        //Переворачивание массива и его вывод
        System.out.println("Перевёрнутый массив");
        for (int i = 0; i < array.length; i++) {

            if (i < array.length / 2) {  //Переворачиваем только первую половину массива, иначе значения
                tmp = array[i];     //второй половины потеряются и получится зеркальный массив
                array[i] = array[array.length - i - 1];
                array[array.length - i - 1] = tmp;
            }

            System.out.printf("%2d", array[i]);
        }
        System.out.println("");
    }
}
