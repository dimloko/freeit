package library.serviceClasses;

import java.util.*;

public class Library {
    private final List<Book> bookList = new ArrayList<>();

    static private final Scanner scLibrary = new Scanner(System.in);

    protected List<Book> getBookList() {
        return bookList;
    }

    //**Метод, добавляющий книгу в конец Lista
    protected void addBook(Book book) {
        System.out.println("\n***Попытка добавить книгу: " + book.toString() + " в библиотеку...");
        for (Book value : bookList) {
            if (value.getId() == book.getId()) {
                System.out.println("Книга с таким ID уже существует в библиотеке***\n");
                return;
            }
        }
        System.out.println("Книга " + book.toString() + " успешно добавлена***\n");
        bookList.add(book);
        printPressEnter();
    }

    //**Метод для вывода содержимого библиотеки в консоль
    protected void printBookList(List<Book> list) {
        for (Book book : list) {
            System.out.println(book.toString());
        }
    }

    //**Метод для удаления книги с указанным ID
    protected void removeBook(int removeId) {
        System.out.println("\n***Попытка удалить книгу с ID = " + removeId + " из библиотеки...***");
        for (int i = 0; i < bookList.size(); i++) {
            if (removeId == bookList.get(i).getId()) {
                System.out.println("***Книга" + bookList.get(i).toString() + " удалена из библиотеки***");
                bookList.remove(i);
                printPressEnter();
                return;
            }
        }
        System.out.println("***Книга c ID = " + removeId + " в библиотеке не найдена***");
        printPressEnter();
    }

    //**Метод для редактирования книги с указанным ID
    protected void editBook(int editId) {
        clear();
        System.out.println("Редактирование книги");
        String newTitle;
        String newGenre;

        for (Book book : bookList) {
            if (editId == book.getId()) {
                System.out.println("***По вашему запросу найдена книга:\n" + book.toString());

                //Ввод нового значения поля title редактируемой книги
                while (true) {
                    System.out.println("Введите новое название книги");
                    newTitle = scLibrary.hasNextLine() ? scLibrary.nextLine() : null;
                    if (newTitle == null) {
                        System.out.println("***Ошибка!!! Введено недопустимое значение поля name***");
                        continue;
                    }
                    break;
                }

                //Ввод нового значения поля genre редактируемой книги
                while (true) {
                    System.out.println("Введите новое название жанра");
                    newGenre = scLibrary.hasNextLine() ? scLibrary.nextLine() : null;
                    if (newGenre == null) {
                        System.out.println("***Ошибка!!! Введено недопустимое значение поля genre***");
                        continue;
                    }
                    break;
                }


                book.setGenre(newGenre);
                book.setTitle(newTitle);
                System.out.println("***Запись книги отредактирована:\n" + book.toString());
                printPressEnter();
                return;
            }
        }
        System.out.println("***Книга c ID = " + editId + " в библиотеке не найдена***");
        printPressEnter();

    }

    //**Метод для сортировки библиотеки перед выводом в консоль по алфавиту(возрастание)
    protected List<Book> getSortedListUp() {
        List<Book> tmpBookList = new ArrayList<>(bookList);
        Comparator<Book> comp = new BookComparatorUp();
        tmpBookList.sort(comp);
        return tmpBookList;
    }

    //**Метод для сортировки библиотеки перед выводом в консоль по алфавиту(убывание)
    protected List<Book> getSortedListDown() {
        List<Book> tmpBookList = new ArrayList<>(bookList);
        Comparator<Book> comp = new BookComparatorDown();
        tmpBookList.sort(comp);
        return tmpBookList;
    }

    //**Метод, осуществляющий задержку перед выходом в меню до нажатия клавиши Enter
    private static void printPressEnter() {
        System.out.println("\nНажмите Enter для продолжения");
        scLibrary.nextLine();
    }

    //**Метод, "очищающий" консоль
    private void clear() {
        for (int i = 0; i < 20; i++) {
            System.out.println();
        }
    }

    /*Можно раскоментировать, чтобы не добавлять книги вручную*/
//    public Library() {
//        bookList.add(new Book(32, "Мурзилка", "Журнал"));
//        bookList.add(new Book(18, "Война и мир", "Роман"));
//        bookList.add(new Book(13, "Советская энциклопедия", "Энциклопедия"));
//        bookList.add(new Book(16, "Конституция РБ", "Фантастика"));
//        bookList.add(new Book(12, "Противостояние", "Роман"));
//    }

}
