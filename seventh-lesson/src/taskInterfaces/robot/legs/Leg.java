package taskInterfaces.robot.legs;

import taskInterfaces.robot.PartsActions;

public class Leg implements PartsActions {
    @Override
    public void action() {
        System.out.println(brand + "'s foot makes a step");
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    private String brand;
    private int price;

    public Leg(String brand, int price) {
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
