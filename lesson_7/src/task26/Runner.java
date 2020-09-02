package task26;

public class Runner {
    public static void main(String[] args) {
        Stove stoveBosh = new Stove();
        Heater heaterVtek = new Heater();


        System.out.println(stoveBosh.toString());
        stoveBosh.setTypeOfEnergy("Electricity");
        stoveBosh.setBarnd("Bosh");
        stoveBosh.setModel("BE-4501");
        stoveBosh.setColor("Black");
        System.out.println(stoveBosh.toString());
        stoveBosh.plugIn();
        stoveBosh.unPlug();


        System.out.println(heaterVtek.toString());
        heaterVtek.setBarnd("Vitek");
        heaterVtek.setPower(1450);
        heaterVtek.setModel("VT-H1540");
        heaterVtek.setMaterial("Plastic");
        System.out.println(heaterVtek.toString());
        heaterVtek.plugIn();
        heaterVtek.unPlug();
    }
}
