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
        String tmpString = reader.readLine();
        while (tmpString != null) {
            blackList.add(tmpString);
            tmpString = reader.readLine();
        }
        reader.close();
    }

    //Считывание текста
    private void readInputText(String inputTextName) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader(inputTextName));
        StringBuilder str = new StringBuilder();
        String tmpString = reader.readLine();
        while (tmpString != null) {
            str.append(tmpString);
            tmpString = reader.readLine();
        }
        reader.close();
        StringTokenizer st = new StringTokenizer(str.toString(), ".?!\n", true);
        while (st.hasMoreTokens()) {
            inputText.add((st.nextToken() + st.nextToken()).trim());
        }
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
