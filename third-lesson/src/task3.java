//Вычислить: 1+2+4+8+...+256

public class task3 {
    public static void main(String[] args) {
        int sum = 0; //Значение суммы членов ряда

        //Вычисление суммы
        for (int i = 1; i <= 256; i *= 2) {
            sum += i;
        }

        //Вывод результата
        System.out.println("1+2+4+8+...+256= " + sum);
    }
}
