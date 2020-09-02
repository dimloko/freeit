package library;

import java.util.LinkedList;

public class Library {
    private LinkedList<Book> bookList = new LinkedList<>();

    public void addBook(Book book){
        System.out.println("\n***Попытка добавить книгу: " + book.toString() + " в библиотеку...");
        for (Book value : bookList) {
            if (value.getId() == book.getId()) {
                System.out.println("Книга с таким id уже существует в библиотеке***\n");
                return;
            }
        }
        System.out.println("Книга " + book.toString() + " успешно добавлена***\n");
        bookList.add(book);
    }
    public void listBookList(){
        System.out.println("\nСписок всех книг в библиотеке:");
        for (Book book : bookList) {
            System.out.println(book.toString());
        }
    }

    public void removeBook(int id){
        System.out.println("\n***Попытка удалить книгу с id = " + id + " из библиотеки...");
        for (int i = 0; i < bookList.size(); i++) {
            if(bookList.get(i).getId()==id){
                bookList.remove(i);
                System.out.println("Книга удалена***\n");
                return;
            }
        }
        System.out.println("Книга с id = " + id + " не найдена в библиотеке");
    }

    public void editBook(int id/*Хрен знает какой здесь аргумент*/){

    }
}
