package taskInterfaces.spaceport;

import java.util.Random;

public class SpaceX implements IStart {
    @Override
    public boolean prelaunchChek() {
        System.out.println(this.name + ":");
        if(r.nextInt(10)>3){
            System.out.println("Check pass");
            if(r.nextBoolean()){
                System.out.println(".....Oh no, we forgot Tesla. ");
                return false;
            }
            return true;
        } else {
            System.out.println("Check failed");
            return false;
        }
    }

    @Override
    public void startEngine() throws InterruptedException {
        System.out.println("SpaceX engines are running. All systems are OK");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    @Override
    public void start() {
        System.out.println("SpaceX start");
    }

    private Random r = new Random();
    private String name;

    public SpaceX(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
