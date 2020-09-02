package library;

import java.io.IOException;

public class LibraryRunner {
    public static void main(String[] args) {
        Library lib = new Library();

        lib.addBook(new Book(32, "Мурзилка", "Журнал"));
        lib.addBook(new Book(18, "Война и мир", "Роман"));
        lib.addBook(new Book(18, "NAme", "genre"));
        

        lib.listBookList();

        lib.removeBook(32);
        lib.removeBook(32);

        lib.listBookList();
    }
}
