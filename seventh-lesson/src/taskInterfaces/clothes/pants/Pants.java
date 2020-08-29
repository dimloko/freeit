package taskInterfaces.clothes.pants;

public class Pants implements ActionPants {
    @Override
    public void dress() {
        System.out.println(this.brand + " pants dressed");
    }

    @Override
    public void takeOff() {
        System.out.println(this.brand + " pants remove");
    }
    private String brand;

    public Pants(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
