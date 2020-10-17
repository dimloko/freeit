package serialization;

import java.io.*;

public class SaveCar {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Car serCar = new Car("Opel", 237, 6999.99);
        System.out.println("Объект до сериализации : " + serCar.toString());
        FileOutputStream fos = new FileOutputStream("./src/serialization/SerialCar.ser");
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(fos);
        objectOutputStream.writeObject(serCar);
        fos.close();

        FileInputStream fis = new FileInputStream("./src/serialization/SerialCar.ser");
        ObjectInputStream objectInputStream = new ObjectInputStream(fis);
        Car deserCar = (Car) objectInputStream.readObject();
        fis.close();
        System.out.println("Объект после десериализации : " + deserCar.toString());

    }
}
