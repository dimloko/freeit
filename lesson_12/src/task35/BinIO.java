package task35;

import java.io.*;
import java.util.Random;

public class BinIO {
    public static void main(String[] args) throws IOException {
        Random rnd = new Random();
        DataOutputStream dataOutputStream = null;
        DataInputStream dataInputStream = null;

        //Запись в файл 20-ти рандомных чисел
        try {
            dataOutputStream = new DataOutputStream(new BufferedOutputStream(new FileOutputStream("./src/task35/task35out.dat")));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        for (int i = 0; i < 20; i++) {
            assert dataOutputStream != null;
            dataOutputStream.writeInt(rnd.nextInt(89) + 10);
        }
        dataOutputStream.close();


        //Чтение из файла 20-ти рандомных чисел, подсчёт их суммы и количества
        try {
            dataInputStream = new DataInputStream(new BufferedInputStream(new FileInputStream("./src/task35/task35out.dat")));
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        }
        assert dataInputStream != null;
        int num = dataInputStream.readInt();
        int sum = num;
        int n = 1;
        System.out.println("Числа из файла:");
        while (true) {
            System.out.print(num + " ");
            try {
                num = dataInputStream.readInt();
            } catch (EOFException e) {
                break;
            }
            sum += num;
            n++;
        }
        dataInputStream.close();
        System.out.println("\nСреднее арифметическое: " + (double)sum/n);
    }
}
