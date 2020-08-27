package taskInterfaces.robot;

import taskInterfaces.robot.hands.Hand;
import taskInterfaces.robot.heads.Head;
import taskInterfaces.robot.legs.Leg;

public class RobotRunner {
    public static void main(String[] args) {
        Robot r1 = new Robot(new Leg("Sony", 2000),
                new Hand("Toshiba", 2630),
                new Head("Samsung", 4890),
                "Chappi");
        Robot r2 = new Robot(new Leg("Toshiba", 999),
                new Hand("Toshiba", 2630),
                new Head("Sony", 5599),
                "T-1000");
        Robot r3 = new Robot(new Leg("Samsung", 1350),
                new Hand("Sony", 3999),
                new Head("Toshiba", 4500),
                "Wall-e");

        r1.actions();
        r2.actions();
        r3.actions();

        if (r1.getPrice() > r2.getPrice()) {
            if (r1.getPrice() > r3.getPrice()) {
                System.out.println("Most expensive robot - " + r1.getName() + "Cost: " + r1.getPrice());
            } else {
                System.out.println("Most expensive robot - " + r3.getName() + "Cost: " + r3.getPrice());
            }
        } else {
            if (r2.getPrice() > r3.getPrice()) {
                System.out.println("Most expensive robot - " + r2.getName() + "Cost: " + r2.getPrice());
            } else {
                System.out.println("Most expensive robot - " + r3.getName() + "Cost: " + r3.getPrice());
            }
        }

    }
}
