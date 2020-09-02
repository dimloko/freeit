package abstractClasses.transport.terrestrial;

public class LightTransport extends Terrestrial {
    protected String bodyType;
    protected int maxPassengers;

    public String getBodyType() {
        return bodyType;
    }

    public void setBodyType(String bodyType) {
        this.bodyType = bodyType;
    }

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    @Override
    public String toString() {
        return "\n" + "LightTransport{" +
                "bodyType='" + bodyType + '\'' +
                ", passengers=" + maxPassengers +
                ", wheels=" + wheels +
                ", fuelConsumption=" + fuelConsumption +
                ", power=" + power + "(" + power * 0.74 + " kW)"+
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String move(int hour, int minute, int second){
        int time = hour * 3600 + minute * 60 + second;
        return move(time);
    }

    public String move(int second){
        double time = second / 3600.0;
        double way = (double) this.maxSpeed * time;
        return "For the time " + time + " h, car " + this.brand + "\n" +
                "driving at maximum speed " + this.maxSpeed + " km / h\n" +
                "will travel " + way + " km and use " + fuelConsumptionCalculation(time, way) + " liters of fuel.";
    }

    private double fuelConsumptionCalculation(double time, double way){
        return this.fuelConsumption / 100 * way;
    }
}
