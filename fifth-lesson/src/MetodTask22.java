/*Написать программу, выполняющую поиск в строке шестнадцатеричных чисел,
записаных по правилам Java, с помощью регулярных выражений и вывести их на
страницу.*/

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetodTask22 {
    public static void main(String[] args) {
        String str = "Red-0xFF0000, Yellow - 0xFFFF00, DarkGoldenRod - 0xB8860B";  //Исходная строка
        Pattern pat = Pattern.compile("0x[A-Fa-f0-9]{1,6}"); //Компиляция представления регулярного выражения
        Matcher mat = pat.matcher(str); //Создание объекта Matcher

        //Поиск и вывод совпадений в строке
        while (mat.find()) {
            System.out.println(mat.group());
        }
    }
}