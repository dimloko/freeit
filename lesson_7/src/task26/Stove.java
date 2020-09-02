package task26;

public class Stove extends KitchenAppliances {
    String typeOfEnergy;

    public Stove(String typeOfEnergy) {
        this.typeOfEnergy = typeOfEnergy;
    }

    public Stove() {

    }

    public String getTypeOfEnergy() {
        return typeOfEnergy;
    }

    public void setTypeOfEnergy(String typeOfEnergy) {
        this.typeOfEnergy = typeOfEnergy;
    }

    @Override
    public String toString() {
        return "Stove{" +
                "typeOfEnergy='" + typeOfEnergy + '\'' +
                ", color='" + color + '\'' +
                ", barnd='" + barnd + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
