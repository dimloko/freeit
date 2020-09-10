package task30;

import java.util.LinkedList;
import java.util.Random;

public class Task30 {
    public static void main(String[] args) {
        int sizeList = 25;
        int count = 0;
        Random random = new Random();
        LinkedList<Integer> numbers = new LinkedList<>();
        for (int i = 0; i < sizeList; i++) {
            numbers.add(random.nextInt(5));
        }

        System.out.println(numbers.toString());

        while (count < numbers.size()) {
            while (numbers.lastIndexOf(numbers.get(count)) != count && numbers.lastIndexOf(numbers.get(count)) != -1) {
                numbers.remove(numbers.lastIndexOf(numbers.get(count)));
            }
            count++;
        }

        System.out.println(numbers.toString());

    }
}
