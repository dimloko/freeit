package censorship;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Censor {
    private final List<String> blackList = new ArrayList<>();
    private final List<String> inputText = new ArrayList<>();

    //Считывание списка слов для цензуры из файла
    private void readBlackList(String blackListName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(blackListName));
        String tmp = reader.readLine();
        while (tmp != null) {
            blackList.add(tmp);
            tmp = reader.readLine();
        }
        reader.close();
    }

    //Считывание текста
    private void readInputText(String inputTextName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("./src/censorship/inputText.txt"));
        StringBuilder str = new StringBuilder();
        String tmp = reader.readLine();
        while (tmp != null) {
            str.append(tmp);
            tmp = reader.readLine();
        }
        reader.close();
        StringTokenizer st = new StringTokenizer(str.toString(), ".?!\n", true);
        while (st.hasMoreTokens()) {
            inputText.add((st.nextToken() + st.nextToken()).trim());
        }
    }

    public List<String> getBlackList() {
        return blackList;
    }

    public List<String> getInputText() {
        return inputText;
    }

    //Метод для поиска недопустимых слов в тексте
    public void exposeCensor(String blackListFilename, String inputTextFilename) throws IOException {
        int quantity;
        int quantitySent = 0;
        readBlackList(blackListFilename);
        readInputText(inputTextFilename);
        for (String s1 : inputText) {
            quantity = 0;
            for (String subStr : blackList) {
                if (s1.toLowerCase().contains(subStr.toLowerCase())) {
                    if (quantity == 0) {
                        System.out.println("\n***Недопустимые слова: ");
                    }
                    System.out.println(" - " + subStr);
                    quantity++;
                }
            }
            if (quantity != 0) {
                quantitySent++;
                System.out.println("\nВ предложении: " + s1 + "***\n");
            }
        }
        System.out.println("Предложений, не прошедших цензуру: " + quantitySent);
    }
}
