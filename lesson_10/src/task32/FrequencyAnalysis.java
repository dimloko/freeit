package task32;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedList;

public class FrequencyAnalysis {
    public static void main(String[] args) {
        int count = 0;
        String string = "Hereupon Legrand arose, with a grave and stately air, and brought me the beetle\n" +
                "from a glass case in which it was enclosed. It was a beautiful scarabaeus, and, at\n" +
                "that time, unknown to naturalists—of course a great prize in a scientific point\n" +
                "of view. There were two round black spots near one extremity of the back, and a\n" +
                "long one near the other. The scales were exceedingly hard and glossy, with all the\n" +
                "appearance of burnished gold. The weight of the insect was very remarkable, and,\n" +
                "taking all things into consideration, I could hardly blame Jupiter for his opinion\n" +
                "respecting it.";
        ArrayList<Symbol> frequencyArray = new ArrayList<>(); //Коллекция объектов символов и их колличества в строке
        LinkedList<Character> charArray = new LinkedList<>(); //Коллекция символов строки


        //Переводим строку в коллекцию символов, приводим коллекцию к нижнему регистру
        for (int i = 0; i < string.length(); i++) {
            charArray.add(string.toLowerCase().charAt(i));
        }

        //Находим повторяющиеся символы и удаляем их подсчитывая количество удалений
        while (count < charArray.size()) {
            frequencyArray.add(new Symbol(charArray.get(count)));
            while (charArray.lastIndexOf(charArray.get(count)) != count && charArray.lastIndexOf(charArray.get(count)) != -1) {
                charArray.remove(charArray.lastIndexOf(charArray.get(count)));
                frequencyArray.get(count).addAppearance();
            }
            count++;
        }

        //Вывод
        for (Symbol symbol : frequencyArray) {
            System.out.println("Символ: '" + symbol.getValue() + "', частота поялления: "
                    + ((float) symbol.getQuantity() / string.length()) * 100 + "%");
        }
    }
}
