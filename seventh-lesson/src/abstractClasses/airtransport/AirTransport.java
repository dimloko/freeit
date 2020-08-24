package abstractClasses.airtransport;

import abstractClasses.Transport;

public class AirTransport extends Transport {
    protected int wingspan;
    protected int minRunwayStrip;

    public int getWingspan() {
        return wingspan;
    }

    public void setWingspan(int wingspan) {
        this.wingspan = wingspan;
    }

    public int getMinRunwayStrip() {
        return minRunwayStrip;
    }

    public void setMinRunwayStrip(int minRunwayStrip) {
        this.minRunwayStrip = minRunwayStrip;
    }

}
