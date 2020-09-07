package library;

import library.serviceClasses.Library;
import library.serviceClasses.Menu;

import java.util.Scanner;

public class LibraryRunner {
    public static void main(String[] args) {
        Scanner scMain = new Scanner(System.in);
        int menuItem;
        Library lib = new Library();

        while (true) {
            Menu.mainMenu();
            menuItem = scMain.hasNextInt() ? scMain.nextInt() : -1;
            switch (menuItem) {
                case 1:
                    Menu.outputMenu(lib);
                    break;
                case 2:
                    Menu.addMenu(lib);
                    break;
                case 3:
                    Menu.removeMenu(lib);
                    break;
                case 4:
                    Menu.editMenu(lib);
                    break;
                case 5:
                    System.out.println("Выход");
                    return;
                default:
                    System.out.println("Введён неверный пункт меню");
                    break;
            }
        }
    }
}
