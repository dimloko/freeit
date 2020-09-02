package taskInterfaces.spaceport;

public class Spaceport {
    public void start(IStart spaceship) throws InterruptedException {
        if(spaceship.prelaunchChek()) {
            spaceship.startEngine();
            spaceship.start();
        }
    }

}

