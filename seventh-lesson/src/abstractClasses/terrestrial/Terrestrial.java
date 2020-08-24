package abstractClasses.terrestrial;

import abstractClasses.Transport;

public class Terrestrial extends Transport {
    protected int wheels;
    protected double fuelConsumption;

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }
}
