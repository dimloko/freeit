package abstractClasses.transport.airtransport;

public class PassengerTransport extends AirTransport {
    protected int maxPassengers;
    protected boolean businessClass;

    public int getMaxPassengers() {
        return maxPassengers;
    }

    public void setMaxPassengers(int maxPassengers) {
        this.maxPassengers = maxPassengers;
    }

    public boolean isBusinessClass() {
        return businessClass;
    }

    public void setBusinessClass(boolean businessClass) {
        this.businessClass = businessClass;
    }

    @Override
    public String toString() {
        return "\n" + "PassengerTransport{" +
                "passengers=" + maxPassengers +
                ", businessClass=" + businessClass +
                ", wingspan=" + wingspan +
                ", minRunwayStrip=" + minRunwayStrip +
                ", power=" + power + "(" + power * 0.74 + " kW)" +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String isFreePlaces(int numberOfPassengers) {
        if (numberOfPassengers <= maxPassengers) {
            return "All passengers on the plane";
        } else {
            return "You need a bigger plane";
        }
    }
}
