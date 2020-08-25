package taskInterfaces.robot.heads;

import taskInterfaces.robot.PartsActions;

public class Head implements PartsActions {
    @Override
    public void action() {
        System.out.println("Blah blah blah - talking head from " + this.brand);
    }

    @Override
    public int getPrice() {
        return this.price;
    }

    private String brand;

    private int price;

    public Head(String brand, int price) {
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
