package abstractClasses;

import abstractClasses.terrestrial.LightTransport;

public class TransportRunner {
    public static void main(String[] args) {
        LightTransport lt = new LightTransport();
        lt.setBodyType("Sedan");
        lt.setMaxPassengers(5);
        lt.setPower(74);
        lt.setWeight(1040);
        lt.setBrand("Seat");
        lt.setWheels(4);
        lt.setMaxSpeed(180);
        lt.setFuelConsumption(15.6);
        System.out.println(lt.toString());
        System.out.println(lt.move(1,0,0));

    }
}
