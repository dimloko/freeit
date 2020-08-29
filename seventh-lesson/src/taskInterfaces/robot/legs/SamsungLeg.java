package taskInterfaces.robot.legs;

public class SamsungLeg implements ILeg {
    private final int PRICE = 2100;
    @Override
    public void action() {
        System.out.println("Samsung's foot makes a step");
    }

    @Override
    public int getPRICE() {
        return this.PRICE;
    }
}
