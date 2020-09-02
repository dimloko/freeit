/*Имеется строка с текстом. Подсчитать количество слов в тексте. Желательно
учесть, что слова могут разделяться несколькими пробелами, в начале и конце
текста также могут быть пробелы, но могут и отсутствовать.*/

import java.util.StringTokenizer;

public class MetodTask19 {
    public static void main(String[] args) {
        String str = "       В чащах юга жил бы цитрус? Да, но    фальшивый экземпляр!  ";
        int n = 0;
        StringTokenizer st = new StringTokenizer(str, " ,./|!?");
        while (st.hasMoreTokens()) {
            n++;
            st.nextToken();
        }
        System.out.println("Количество слов в строке: " + n);
    }
}