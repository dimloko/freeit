package task26;

public class Runner {
    public static void main(String[] args) {
        Stove s = new Stove();
        Heater h = new Heater();


        System.out.println(s.toString());
        s.setTypeOfEnergy("Electricity");
        s.setBarnd("Bosh");
        s.setModel("BE-4501");
        s.setColor("Black");
        System.out.println(s.toString());
        s.plugIn();
        s.unPlug();


        System.out.println(h.toString());
        h.setBarnd("Vitek");
        h.setPower(1450);
        h.setModel("VT-H1540");
        h.setMaterial("Plastic");
        System.out.println(h.toString());
        h.plugIn();
        h.unPlug();
    }
}
