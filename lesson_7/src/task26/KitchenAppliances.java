package task26;

public class KitchenAppliances extends Appliances {
    String color;

    @Override
    public void plugIn() {
        System.out.println("Signal lamp BLINK");
    }

    @Override
    public void unPlug() {
        System.out.println("Signal lamp NOT BLINK");
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
