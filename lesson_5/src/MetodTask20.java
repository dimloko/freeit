/*Имеется строка с текстом. Вывести текст, составленный из последних букв
всех слов.*/


import java.util.StringTokenizer;

public class MetodTask20 {
    public static void main(String[] args) {
        String str = "В чащах юга жил бы цитрус? Да, но фальшивый экземпляр!";
        StringBuilder result = new StringBuilder();
        String tmp;
        StringTokenizer st = new StringTokenizer(str, " ,./|!?");
        while (st.hasMoreTokens()) {
            tmp = st.nextToken();
            result.append(tmp.substring(tmp.length() - 1));
        }
        System.out.println(result);
    }
}