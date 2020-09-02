package task26;

public abstract class Appliances {
    String barnd;
    String model;

    public abstract void plugIn();

    public abstract void unPlug();

    public String getBarnd() {
        return barnd;
    }

    public void setBarnd(String barnd) {
        this.barnd = barnd;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }
}
