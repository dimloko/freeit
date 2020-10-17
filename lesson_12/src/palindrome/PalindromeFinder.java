package palindrome;


import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PalindromeFinder {

    private final List<String> words = new ArrayList<>(); //Коллекция слов из файле

    //Добавление слова в коллекцию
    public boolean addWord(String word) {
        if (word == null) {
            return false;
        }
        words.add(word);
        return true;
    }

    //Вывод слов в консоль
    public void listWords() {
        System.out.println("Слова в файле\n" + words.toString());
    }

    //Проверка слова на то, является ли оно полиндромом
    private boolean isPalindrome(String word) {
        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) != word.charAt(word.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }

    //Запись полиндромов в файл
    public void writePalindromes() throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("./src/palindrome/palindromes.txt"));
        for (String word : words) {
            if (isPalindrome(word)) {
                bufferedWriter.write(word + "\n");
            }
        }
        bufferedWriter.close();
    }
}
