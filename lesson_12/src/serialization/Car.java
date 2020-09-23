package serialization;

import java.io.Serializable;

public class Car implements Serializable {
    String brand;
    int maxSpeed;
    double price;

    public Car(String barnd, int maxSpeed, double price) {
        this.brand = barnd;
        this.maxSpeed = maxSpeed;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", maxSpeed=" + maxSpeed +
                ", price=" + price +
                '}';
    }
}
