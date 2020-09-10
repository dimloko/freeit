package task31;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;

public class Task31 {
    public static void main(String[] args) {
        int sizeList = 20;
        Random random = new Random();
        ArrayList<Integer> randomNumbers = new ArrayList<>();
        for (int i = 0; i < sizeList; i++) {
            randomNumbers.add(random.nextInt(25));
        }

        System.out.println("Исходный массив:\n" + randomNumbers.toString());

        ListIterator<Integer> iterator = randomNumbers.listIterator();

        int maxValue = randomNumbers.get(0);

        while (iterator.hasNext()) {
            if (iterator.next() > maxValue) {
                maxValue = iterator.previous();
            }
        }

        System.out.println("\nМаксимальное значение: " + maxValue);
    }
}
