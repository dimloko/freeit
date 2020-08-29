package task26;

public class OtherAppliances extends Appliances {
    String material;

    @Override
    public void plugIn() {
        System.out.println("Signal lamp ON");
    }

    @Override
    public void unPlug() {
        System.out.println("Signal lamp OFF");
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }
}
