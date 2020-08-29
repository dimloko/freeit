package taskInterfaces.clothes.shoes;

public class Shoes implements ActionShoes {
    @Override
    public void dress() {
        System.out.println(this.brand + " shoes dressed");
    }

    @Override
    public void takeOff() {
        System.out.println(this.brand + " shoes remove");
    }
    private String brand;

    public Shoes(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
}
