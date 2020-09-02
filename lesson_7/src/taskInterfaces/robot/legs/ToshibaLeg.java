package taskInterfaces.robot.legs;

public class ToshibaLeg implements ILeg {
    private final int PRICE = 1300;
    @Override
    public void action() {
        System.out.println("Toshiba's foot makes a step");
    }

    @Override
    public int getPRICE() {
        return this.PRICE;
    }
}
