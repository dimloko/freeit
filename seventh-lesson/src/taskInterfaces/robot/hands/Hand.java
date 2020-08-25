package taskInterfaces.robot.hands;

import taskInterfaces.robot.PartsActions;

public class Hand implements PartsActions {
    @Override
    public void action() {
        System.out.println("Hand from " + brand + " waving");
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    private String brand;

    private int price;

    public Hand(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
