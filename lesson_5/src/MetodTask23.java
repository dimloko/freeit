/*Написать программу, выполняющую поиск в строке всех тегов абзацев, в т.ч. тех, у
которых есть параметры, например <p id=”p1”>, и заменить их на простые теги
абзацев <p>.*/


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetodTask23 {
    public static void main(String[] args) {
        String str = "<p style=\"color: red; font-size: 2em\">Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diem " +
                "  nonummy nibh euismod tincidunt ut lacreet dolore magna aliguam erat volutpat.</p>" +
                "  <p allign=\"center\">Ut wisis enim ad minim veniam, quis nostrud exerci tution ullamcorper " +
                "  suscipit lobortis nisl ut aliquip ex ea commodo consequat.</p>";

        Pattern pat = Pattern.compile("[<]\\s*[p][^>]*[>]"); //Компиляция представления регулярного выражения
        Matcher mat = pat.matcher(str); //Создание объекта Matcher

        System.out.println(str);
        //Поиск и вывод совпадений в строке
        while (mat.find()) {
            str = mat.replaceAll("<p>");
        }
        System.out.println(str);
        System.out.println();
    }
}
