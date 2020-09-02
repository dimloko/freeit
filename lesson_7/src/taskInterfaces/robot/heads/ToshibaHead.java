package taskInterfaces.robot.heads;

public class ToshibaHead implements IHead {
    private final int PRICE = 4800;
    @Override
    public void action() {
        System.out.println("Blah blah blah - talking head from Toshiba");
    }

    @Override
    public int getPRICE() {
        return this.PRICE;
    }
}
