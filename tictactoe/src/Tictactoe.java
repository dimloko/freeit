import java.util.Scanner;

public class Tictactoe {
    public static void main(String[] args) {

        int[][] array = {{2, 2, 2}, {2, 2, 2}, {2, 2, 2},}; //2 клетка свободна, 1 - крестик Х, 0 - нолик 0
        Scanner sc = new Scanner(System.in);

        while (true) {
            out(array); //Вывод игрового поля
            userInput(sc, array); //Ход игрока
            if (!stepAI(array, 0, 2)) {     //Сначала ищем 0 в количестве 2 шт.
                if (!stepAI(array, 1, 2)) { //Если не находим, то ищем 1 в количестве 2 шт
                    stepAI(array, 1, 1);    //Если не находим, то ищем 1 в количестве 1 шт
                }
            }
            if (check(array)) { //Проверка поля на выйгрыш либо наличие своьодных клеток
                out(array);
                System.out.println("Игра окончена");
                break;
            }
        }
    }

    //Вывод игрового поля
    static void out(int[][] array) {
        System.out.println("|---|---|---|");
        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                if (ints[j] == 0) {
                    System.out.print("| 0 ");
                }
                if (ints[j] == 1) {
                    System.out.print("| X ");
                }
                if (ints[j] == 2) {
                    System.out.print("|   ");
                }
            }
            System.out.println("|");
            System.out.println("|---|---|---|");

        }
    }

    //Ход игрока
    static void userInput(Scanner sc, int[][] array) {

        if (check(array)) { //Проверка количества оставшихся незаполненных клеток
            return;
        }

        int i, j; //Строка и столбец для хода игрока

        while (true) {

            //Ввод номера строки
            System.out.println("Введите номер строки, в которой хотите поставить X");
            while (true) {
                i = sc.hasNextInt() ? sc.nextInt() : 0;
                if (i < 1 || i > 3) { //Проверка диапазона
                    System.out.println("Введено некрректное значение, попробуйте ещё раз");
                } else { //Если в диапазоне
                    i--;
                    break;
                }
            }

            //Ввод номера столбца
            System.out.println("Введите номер столбца, в котором хотите поставить X");
            while (true) {
                j = sc.hasNextInt() ? sc.nextInt() : 0;
                if (j < 1 || j > 3) { //Проверка диапазона
                    System.out.println("Введено некрректное значение, попробуйте ещё раз");
                } else { //Если в диапазоне
                    j--;
                    break;
                }
            }

            //Проверка клетки на занятость, 2 - клетка свободна
            if (array[i][j] == 2) {
                array[i][j] = 1;
                break;
            }
            System.out.println("Выбрана занятая клетка, попробуйте ещё раз");
        }
    }

    //Ход компьютера
    static boolean stepAI(int[][] array, int search, int quantity) {
        //search - что ищем, крестики(1) либо нолики(0)
        //mode - в каком количестве ищем
        int flag;

        //Проверка горизонтали
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == 2 || array[i][1] == 2 || array[i][2] == 2) {
                flag = 0;
                for (int j = 0; j < array.length; j++) {

                    if (array[i][j] == search) {
                        flag++;
                    }
                    if (flag == quantity) {
                        step(1, array, i);
                        return true;
                    }
                }
            }
        }

        //Проверка вертикали
        for (int i = 0; i < array.length; i++) {
            if (array[0][i] == 2 || array[1][i] == 2 || array[2][i] == 2) {
                flag = 0;
                for (int[] ints : array) {

                    if (ints[i] == search) {
                        flag++;
                    }
                    if (flag == quantity) {
                        step(2, array, i);
                        return true;
                    }
                }
            }
        }

        //Проверка диагонали
        if (array[0][0] == 2 || array[1][1] == 2 || array[2][2] == 2) {
            flag = 0;
            for (int i = 0; i < array.length; i++) {
                if (array[i][i] == search) {
                    flag++;
                }
                if (flag == quantity) {
                    step(3, array, -1);
                    return true;
                }
            }
        }

        //Проверка диагонали
        if (array[0][2] == 2 || array[1][1] == 2 || array[2][0] == 2) {
            flag = 0;
            if (array[0][2] == search) {
                flag++;
            }
            if (array[1][1] == search) {
                flag++;
            }
            if (array[2][0] == search) {
                flag++;
            }
            if (flag == quantity) {
                step(4, array, -1);
                return true;
            }

        }
        return false;
    }

    //Ввод компьютера
    static void step(int mode, int[][] array, int place) {
        //mode 1-ввод по горизонтали, 2 - по вертикали, 3,4- по диагоналям
        if (mode == 1) { //горизонталь
            for (int i = 0; i < array.length; i++) {
                if (array[place][i] == 2) {
                    array[place][i] = 0;
                    break;
                }
            }
        }

        if (mode == 2) { //вертикаль
            for (int i = 0; i < array.length; i++) {
                if (array[i][place] == 2) {
                    array[i][place] = 0;
                    break;
                }
            }
        }

        if (mode == 3) { //диагональ
            for (int i = 0; i < array.length; i++) {
                if (array[i][i] == 2) {
                    array[i][i] = 0;
                    break;
                }
            }
        }

        if (mode == 4) { //диагональ
            if (array[0][2] == 2) {
                array[0][2] = 0;
            } else if (array[1][1] == 2) {
                array[1][1] = 0;
            } else if (array[2][0] == 2) {
                array[2][0] = 0;
            }
        }
    }

    //Проверка на победу и количество незаполненных клеток
    static boolean check(int[][] array) {
        int flag2 = 0;

        for (int[] ints : array) {
            for (int j = 0; j < array.length; j++) {
                if (ints[j] == 2) {
                    flag2++;
                    break;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i][0] == array[i][1] && array[i][1] == array[i][2] && array[i][2] != 2) {
                return true;
            }
            if (array[0][i] == array[1][i] && array[1][i] == array[2][i] && array[2][i] != 2) {
                return true;
            }
        }
        if (array[0][0] == array[1][1] && array[1][1] == array[2][2] && array[2][2] != 2) {
            return true;
        }
        if (array[0][2] == array[1][1] && array[1][1] == array[2][0] && array[2][0] != 2) {
            return true;
        }
        if (flag2 == 0) {
            System.out.println("Клетки закончились(");
            return true;
        }
        return false;
    }
}
