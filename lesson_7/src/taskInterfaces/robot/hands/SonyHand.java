package taskInterfaces.robot.hands;

public class SonyHand implements IHand {

    private final int PRICE = 2430;
    @Override
    public void action() {
        System.out.println("Hand from Sony waving");
    }

    @Override
    public int getPRICE() {
        return this.PRICE;
    }

}
