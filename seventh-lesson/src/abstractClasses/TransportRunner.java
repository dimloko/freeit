package abstractClasses;

import abstractClasses.transport.airtransport.PassengerTransport;
import abstractClasses.transport.airtransport.MilitaryTransport;
import abstractClasses.transport.terrestrial.FreightTransport;
import abstractClasses.transport.terrestrial.LightTransport;

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

        FreightTransport ft = new FreightTransport();
        ft.setBrand("MAZ");
        ft.setPayLoad(7000);
        ft.setMaxSpeed(110);
        ft.setPower(321);
        ft.setFuelConsumption(18.4);
        ft.setWheels(6);
        ft.setWeight(4670);
        System.out.println(ft.toString());
        System.out.println(ft.isLoad(4500));
        System.out.println(ft.isLoad(7120));

        MilitaryTransport mt = new MilitaryTransport();
        mt.setBrand("KA-52");
        mt.setBailoutSystem(true);
        mt.setMaxSpeed(300);
        mt.setRockets(1);
        mt.setPower(4800);
        mt.setWeight(10800);
        mt.setWingspan(7);
        mt.setMinRunwayStrip(0);
        System.out.println(mt.toString());
        System.out.println(mt.shoot());
        System.out.println(mt.shoot());
        System.out.println(mt.Bailout());

        PassengerTransport pt = new PassengerTransport();
        pt.setBrand("Boeing");
        pt.setBusinessClass(true);
        pt.setMaxPassengers(210);
        pt.setWingspan(59);
        pt.setPower(15600);
        pt.setMaxSpeed(960);
        pt.setMinRunwayStrip(2700);
        pt.setWeight(106000);
        System.out.println(pt.toString());
        System.out.println(pt.isFreePlaces(208));
        System.out.println(pt.isFreePlaces(212));
    }
}
