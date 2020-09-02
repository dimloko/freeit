package abstractClasses.transport.airtransport;

public class MilitaryTransport extends AirTransport {
    protected boolean bailoutSystem;
    protected int rockets;

    public boolean isBailoutSystem() {
        return bailoutSystem;
    }

    public void setBailoutSystem(boolean bailoutSystem) {
        this.bailoutSystem = bailoutSystem;
    }

    public int getRockets() {
        return rockets;
    }

    public void setRockets(int rockets) {
        this.rockets = rockets;
    }

    @Override
    public String toString() {
        return "\n" + "MilitaryTransport{" +
                "bailoutSystem=" + bailoutSystem +
                ", rockets=" + rockets +
                ", wingspan=" + wingspan +
                ", minRunwayStrip=" + minRunwayStrip +
                ", power=" + power + "(" + power * 0.74 + " kW)" +
                ", maxSpeed=" + maxSpeed +
                ", weight=" + weight +
                ", brand='" + brand + '\'' +
                '}';
    }

    public String shoot(){
        if(this.rockets>0){
            this.rockets--;
            return "Rocket away...";
        } else {
            return "NO MORE ROCKETS";
        }
    }

    public String Bailout(){
        if(this.bailoutSystem){
            return "The bailout was successful";
        } else {
            return "You don't have such system =(";
        }
    }
}
