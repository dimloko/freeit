package taskInterfaces.clothes.jackeet;

public class Jacket implements ActionJacket {
    @Override
    public void dress() {
        System.out.println(this.brand + " jacket dressed");
    }

    @Override
    public void takeOff() {
        System.out.println(this.brand + " jacket remove");
    }

    private String brand;

    public Jacket(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
