/*Напишите программу печати таблицы перевода расстояний из
дюймов в сантиметры для значений длин от 1 до 20 дюймов. 1 дюйм = 2,54 см*/

public class task5 {
    public static void main(String[] args) {
        //Шапка таблицы
        System.out.printf("|------|------|%n");
        System.out.printf("| inch |  cm  |%n");
        System.out.printf("|------|------|%n");

        //Вывод таблицы
        for (int i = 1; i <= 20; i++) {
            System.out.printf("|%6d|%6.2f|%n", i, i * 2.54);
            System.out.printf("|------|------|%n");
        }
    }
}
