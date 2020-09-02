package taskInterfaces.robot.heads;

public class SonyHead implements IHead {
    private final int PRICE = 5780;
    @Override
    public void action() {
        System.out.println("Blah blah blah - talking head from Sony");
    }

    @Override
    public int getPRICE() {
        return this.PRICE;
    }
}

