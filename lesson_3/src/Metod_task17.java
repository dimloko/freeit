/*Создать двухмерный квадратный массив, и заполнить его «бабочкой», т.е
таким образом:
1    1    1    1    1
0    1    1    1    0
0    0    1    0    0
0    1    1    1    0
1    1    1    1    1
*/


import java.util.Scanner;

public class Metod_task17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Ввод размерности массива
        System.out.println("Введите размер массива:");
        int n = sc.hasNextInt() ? sc.nextInt() : 5;
        int array[][] = new int[n][n];

        //Заполнение верхнего треугольника массива единицами
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 1;
                if (j < i || j >= array.length - i) {
                    array[i][j] = 0;
                }
            }
        }

        //Копируем верхний треугольник из единиц в зеркальном отражении в нижний треугольник
        for (int j = 0; j < array.length; j++) {
            for (int i = 0; i < array.length / 2; i++) {
                array[array.length - 1 - i][j] = array[i][j];
            }
        }

        //Вывод массива
        System.out.println("");
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
