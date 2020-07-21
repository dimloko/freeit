/*Одноклеточная амеба каждые 3 часа делится на 2 клетки.
Определить,сколько амеб будет через 3, 6, 9, 12,..., 24 часа.*/

public class task2 {
    public static void main(String[] args) {

        int ameba = 1; //Колличество амеб
        int hour = 0; //Счётчик часов

        //Вывод шапки таблицы
        System.out.printf("|------|-------|%n");
        System.out.printf("| Часы | Амебы |%n");
        System.out.printf("|------|-------|%n");

        //Подсчёт колличества амеб, часов и вывод таблицы
        while (hour < 24) {
            hour += 3;
            ameba *= 2;
            System.out.printf("|%6d| %6d|%n", hour, ameba);
            System.out.printf("|------|-------|%n");

        }
    }
}
