package taskInterfaces.spaceport;

public class SpaceportRunner {
    public static void main(String[] args) throws InterruptedException {
        Spaceport citadel = new Spaceport();
        Shuttle apollo = new Shuttle("Apollo");
        citadel.start(apollo);

        SpaceX falcon = new SpaceX("Falcon 9");
        citadel.start(falcon);
    }

}
