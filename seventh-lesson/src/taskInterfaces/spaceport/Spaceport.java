package taskInterfaces.spaceport;

public class Spaceport {
    public void start(IStart shuttle) throws InterruptedException {
        if(shuttle.prelaunchChek()) {
            shuttle.startEngine();
            shuttle.start();
        }
    }

}

