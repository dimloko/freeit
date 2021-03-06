package task34;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class IOTask34 {
    public static void main(String[] args) throws IOException, NumberFormatException {
        String tempString; //Временная строка для текущего токена и для записи следующей строки из файла
        Pattern pat = Pattern.compile("\\d+"); //Компиляция регулярного выражения для поиска чисел
        Matcher mat; //Создание объекта класса Matcher
        int sum = 0;
        List<Integer> numbers = new ArrayList<>(); //Коллекция для чисел, найденных в файле
        BufferedReader fis = new BufferedReader(new FileReader("./src/task34/test.txt"));
        tempString = fis.readLine();

        System.out.println("Тескт из файла:");
        while (tempString != null) { //Нахождение всех чисел в файле
            System.out.println(tempString);
            mat = pat.matcher(tempString);
            while (mat.find()) {
                numbers.add(Integer.parseInt(mat.group()));//Добавление найденных чисел в коллекцию
                sum += numbers.get(numbers.size() - 1);

            }
            tempString = fis.readLine();
        }

        System.out.println("\nЧисла найденные в файле\n" + numbers.toString()); //Вывод чисел


        System.out.println("\nСумма всех чисел, найденных в файле: " + sum);

        System.out.println("\nПосле удаления повторяющихся чисел:\n" + numbers.stream().distinct().collect(Collectors.toList()));

    }
}
