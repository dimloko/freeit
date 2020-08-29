package taskInterfaces.robot.heads;

public class SamsungHead implements IHead {
    private final int PRICE = 5999;
    @Override
    public void action() {
        System.out.println("Blah blah blah - talking head from Samsung");
    }

    @Override
    public int getPRICE() {
        return this.PRICE;
    }
}
