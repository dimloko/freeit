package taskInterfaces.robot.legs;

public class SonyLeg implements ILeg {
    private final int PRICE = 2650;
    @Override
    public void action() {
        System.out.println("Sony's foot makes a step");
    }

    @Override
    public int getPRICE() {
        return this.PRICE;
    }

}
