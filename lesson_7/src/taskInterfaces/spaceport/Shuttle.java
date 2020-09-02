package taskInterfaces.spaceport;

import java.util.Random;

public class Shuttle implements IStart {
    @Override
    public boolean prelaunchChek() {
        System.out.println(this.name + ":");
        if (r.nextInt(10) > 3) {
            System.out.println("Check pass");
            return true;
        } else {
            System.out.println("Check failed");
            return false;
        }
    }

    @Override
    public void startEngine() throws InterruptedException {
        System.out.println("Shuttle engines are running. All systems are OK");
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            Thread.sleep(1000);
        }
    }

    @Override
    public void start() {
        System.out.println("Shuttle start");
    }


    private Random r = new Random();
    private String name;


    public void setName(String name) {
        if (name.equals("Challenger") || name.equals("challenger")) {
            System.out.println("Are you serious? Challenger?.....ok");
        }
        this.name = name;
    }

    public Shuttle(String name) {
        if (name.equals("Challenger") || name.equals("challenger")) {
            System.out.println("Are you serious? Challenger?.....ok");
        }
        this.name = name;
    }
}
