package task26;

import task26.OtherAppliances;

public class Heater extends OtherAppliances {
    int power;

    public Heater() {

    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return "Heater{" +
                "power=" + power +
                ", material='" + material + '\'' +
                ", barnd='" + barnd + '\'' +
                ", model='" + model + '\'' +
                '}';
    }
}
