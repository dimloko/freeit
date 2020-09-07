package library.serviceClasses;

import library.serviceClasses.Book;

import java.util.Comparator;

public class BookComparatorDown implements Comparator<Book> {
    @Override
    public int compare(Book book1, Book book2) {
        return book2.getTitle().compareTo(book1.getTitle());
    }
}
