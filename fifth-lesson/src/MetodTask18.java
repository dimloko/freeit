/*Найти в строке не только запятые, но и другие знаки препинания. Подсчитать
общее их количество.*/


public class MetodTask18 {
    public static void main(String[] args) {
        String str = " Строковый литерал — это последовательность символов, " +
                "заключенных в двойные кавычки.&? "; // Исходная строка
        int n = 0; //Счётчик символов
        char[] symbolsCheck = {',', '.', '-', '?', '!', '|', '%', '/', '=', '_', '&'}; //Массив символов для поиска
        char symbol;
        for (int i = 0; i < str.length(); i++) {
            symbol = str.charAt(i);
            for (int j = 0; j < symbolsCheck.length; j++) {
                if (symbol == symbolsCheck[j]) {
                    n++;
                }
            }
        }
        System.out.println("Количество знаков препинанния: " + n);

    }
}