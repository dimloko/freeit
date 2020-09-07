package library.serviceClasses;

import java.util.Scanner;

public class Menu {
    static Scanner scMenu = new Scanner(System.in);
    static int menuItem;

    //**Главное меню**
    public static void mainMenu() {
        clear();
        System.out.println("\t\tМеню");
        System.out.println("1 - Вывод всех книг");
        System.out.println("2 - Добавление книги");
        System.out.println("3 - Удаление книги");
        System.out.println("4 - Редактирование книги");
        System.out.println("5 - Выход");
    }

    //**Меню вывода содержимого библиотеки в порядке, выбранном пользователем**
    public static void outputMenu(Library lib) {
        while (true) {
            clear();
            System.out.println("\t\tВывод всех книг\n");
            System.out.println("В каком порядке выводить книги?");
            System.out.println("1 - По алфавиту(возрастание)");
            System.out.println("2 - По алфавиту(убывание)");
            System.out.println("3 - В порядке добавления");
            System.out.println("4 - Возврат в главное меню");
            menuItem = scMenu.hasNextInt() ? scMenu.nextInt() : -1;
            scMenu.nextLine();
            switch (menuItem) {
                case 1:
                    System.out.println("\nСписок всех книг в библиотеке в алфавитном порядке по возрастанию:");
                    lib.printBookList(lib.getSortedListUp());
                    printPressEnter();
                    break;
                case 2:
                    System.out.println("\nСписок всех книг в библиотеке в алфавитном порядке по убыванию:");
                    lib.printBookList(lib.getSortedListDown());
                    printPressEnter();
                    break;
                case 3:
                    System.out.println("\nСписок всех книг в библиотеке в порядке добавления:");
                    lib.printBookList(lib.getBookList());
                    printPressEnter();
                    break;
                case 4:
                    return;
                default:
                    System.out.println("Введён неверный пункт меню");
                    printPressEnter();
                    break;
            }
        }
    }

    //**Меню добавления книги в библиотеку**
    public static void addMenu(Library lib) {
        int id;
        String title;
        String genre;

        clear();

        //Ввод id добавляемой книги
        while (true) {
            System.out.println("Введите id добавляемой книги или \"0\" для выхода в главное меню ");
            id = scMenu.hasNextInt() ? scMenu.nextInt() : -1;
            if (id <= -1) {
                System.out.println("***Ошибка!!! Введено недопустимое значение поля id***");
                continue;
            }
            if (id == 0) return;
            scMenu.nextLine();
            break;
        }

        //Ввод title добавляемой книги
        while (true) {
            System.out.println("Введите название книги");
            title = scMenu.hasNextLine() ? scMenu.nextLine() : null;
            if (title == null) {
                System.out.println("***Ошибка!!! Введено недопустимое значение поля name***");
                continue;
            }
            break;
        }

        //Ввод genre добавляемой книги
        while (true) {
            System.out.println("Введите название жанра");
            genre = scMenu.hasNextLine() ? scMenu.nextLine() : null;
            if (genre == null) {
                System.out.println("***Ошибка!!! Введено недопустимое значение поля genre***");
                continue;
            }
            break;
        }

        //Попытка добавить книгу с выше полями параметрами
        lib.addBook(new Book(id, title, genre));
    }

    //**Меню удаления книги с id указанным пользователем
    public static void removeMenu(Library lib) {
        clear();
        System.out.println("Удаление книги");
        int removeId;

        //Ввод id удаляемой книги с проверкой на корректность вводимых данных
        while (true) {
            System.out.println("Введите id удаляемой книги или \"0\" для выхода в главное меню ");
            removeId = scMenu.hasNextInt() ? scMenu.nextInt() : -1;
            if (removeId <= -1) {
                System.out.println("***Ошибка!!! Введено недопустимое значение поля id***");
                scMenu.nextLine();
                continue;
            }
            if (removeId == 0) return;
            scMenu.nextLine();
            break;
        }

        //Попытка удалить книгу из библиотеки с указанным id
        lib.removeBook(removeId);
    }

    //**Меню редактирования книги с id указанным пользователем
    public static void editMenu(Library lib) {
        clear();
        System.out.println("Редактирование книги");
        int editId;

        //Ввод id редактируемой книги с проверкой на корректность вводимых данных
        while (true) {
            System.out.println("Введите ID редактируемой книги или \"0\" для выхода в главное меню ");
            editId = scMenu.hasNextInt() ? scMenu.nextInt() : -1;
            if (editId <= -1) {
                System.out.println("***Ошибка!!! Введено недопустимое значение поля ID***");
                scMenu.nextLine();
                continue;
            }
            if (editId == 0) return;
            scMenu.nextLine();
            break;
        }

        //Попытка редактировать книгу из библиотеки с указанным id
        lib.editBook(editId);
    }

    //**Метод, осуществляющий задержку перед выходом в меню до нажатия клавиши Enter
    private static void printPressEnter() {
        System.out.println("\nНажмите Enter для продолжения");
        scMenu.nextLine();
    }

    //**Метод, "очищающий" консоль
    private static void clear() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }

}
