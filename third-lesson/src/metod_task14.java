//Создать массив оценок произвольной длины, вывести максимальную и минимальную оценку, её (их) номера.

import java.util.Random;
import java.util.Scanner;

public class metod_task14 {
    public static void main(String[] args) {
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        int i_max = 0, i_min = 0;//Индекс максимального элемента массива

        //Ввод размерности массива
        System.out.println("Введите размер массива:");
        int n = sc.hasNextInt() ? sc.nextInt() : 10;
        int marks[] = new int[n];

        //Генерация массива оценок, его вывод и поиск максимальной и минимальной оценки
        for (int i = 0; i < marks.length; i++) {
            marks[i] = rand.nextInt(10);
            System.out.printf("marks[%d]=%d%n", i, marks[i]);
            if (marks[i] > marks[i_max]) {
                i_max = i;
            }
            if (marks[i] < marks[i_min]) {
                i_min = i;
            }
        }

        //Вывод результата
        System.out.printf("%nМаксимальная оценка marks[%d]=%d%n", i_max, marks[i_max]);
        System.out.printf("%nМинимальная оценка marks[%d]=%d%n", i_min, marks[i_min]);
    }
}
