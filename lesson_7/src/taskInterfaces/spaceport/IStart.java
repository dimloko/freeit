package taskInterfaces.spaceport;

public interface IStart {
    boolean prelaunchChek();
    void startEngine() throws InterruptedException;
    void start();
}