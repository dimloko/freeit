package abstractClasses.terrestrial;

public class FreightTransport extends Terrestrial {

    int payLoad;

    public int getPayLoad() {
        return payLoad;
    }

    public void setPayLoad(int payLoad) {
        this.payLoad = payLoad;
    }

    @Override
    public String toString() {
        return "FreightTransport{" +
                "payLoad=" + payLoad +
                ", wheels=" + wheels +
                ", fuelConsumption=" + fuelConsumption +
                ", power=" + power +
                ", powerKW=" + power + "(" + power * 0.74 + " kW)" +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String isLoad(int weightOfCargo) {
        if (weightOfCargo <= payLoad) {
            return "Truck loaded";
        } else {
            return "You need a bigger truck";
        }
    }
}
