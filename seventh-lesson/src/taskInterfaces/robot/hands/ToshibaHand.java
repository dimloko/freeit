package taskInterfaces.robot.hands;

public class ToshibaHand implements IHand {
    private final int PRICE = 1999;
    @Override
    public void action() {
        System.out.println("Hand from Toshiba waving");
    }

    @Override
    public int getPRICE() {
        return this.PRICE;
    }
}
