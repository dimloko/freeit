package task33;

import java.io.*;
import java.util.StringTokenizer;

public class IOTask33 {
    public static void main(String[] args) throws IOException {
        int numOfWord = 0; // количество слов
        int numOfPMarks = 0; // количество знаков препинания
        String tempString; //Временная строка для текущего токена и для записи следующей строки из файла
        BufferedReader fis =new BufferedReader(new FileReader("./src/task33/test.txt")) ;
        tempString = fis.readLine();
        StringTokenizer st;

        System.out.println("Тескт из файла:");
        while (tempString != null) {
            st = new StringTokenizer(tempString);
            System.out.println(tempString);
            while (st.hasMoreTokens()) {
                numOfWord++;
                tempString = st.nextToken();
                for (int i = 0; i < tempString.length(); i++) {
                    if(!Character.isDigit(tempString.charAt(i)) && !Character.isLetter(tempString.charAt(i))){
                        numOfPMarks++;
                    }
                }
            }
            tempString = fis.readLine();
        }

        System.out.println("\nКоличество знаков препинания: " + numOfPMarks);
        System.out.println("Количество слов: " + numOfWord);
    }
}
