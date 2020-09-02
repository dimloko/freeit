package task29;

import java.util.ArrayList;
import java.util.Random;

public class PupilRunner {
    public static void main(String[] args) {
        Random random = new Random();
        int sizeList = 10; //Клличество учеников в списке
        ArrayList<Pupil> markList = new ArrayList<>();

        //Инициализация массива учеников
        for (int i = 0; i < sizeList; i++) {
            markList.add(new Pupil("Pupil " + (i + 1), random.nextInt(10)));
        }

        //Вывод массива учеников
        for (Pupil pupil : markList) {
            System.out.println(pupil.toString());
        }


        //Удаление неудовлетвоорительных оценок
        for (int i = 0; i < markList.size(); i++) {
            if (markList.get(i).getMark() < 4) {
                markList.remove(i);
                i--;
            }
        }

        //Вывод редактированного списка
        System.out.println("\nРедактированный список");
        for (Pupil pupil : markList) {
            System.out.println(pupil.toString());
        }
    }
}
