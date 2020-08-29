package taskInterfaces.robot.hands;

public class SamsungHand implements IHand {
    private final int PRICE = 2950;
    @Override
    public void action() {
        System.out.println("Hand from Samsung waving");
    }

    @Override
    public int getPRICE() {
        return this.PRICE;
    }
}
