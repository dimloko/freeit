package taskInterfaces.robot;

import taskInterfaces.robot.hands.ToshibaHand;
import taskInterfaces.robot.heads.SamsungHead;
import taskInterfaces.robot.heads.SonyHead;
import taskInterfaces.robot.legs.SamsungLeg;
import taskInterfaces.robot.legs.SonyLeg;
import taskInterfaces.robot.legs.ToshibaLeg;

public class RobotRunner {
    public static void main(String[] args) {
        Robot robot1 = new Robot(new SonyLeg(), new ToshibaHand(), new SamsungHead(), "Chappi");
        Robot robot2 = new Robot(new ToshibaLeg(), new ToshibaHand(), new SonyHead(), "T-1000");
        Robot robot3 = new Robot(new SamsungLeg(), new ToshibaHand(), new SonyHead(), "Wall-e");

        robot1.actions();
        robot2.actions();
        robot3.actions();

        if (robot1.getPrice() > robot2.getPrice()) {
            if (robot1.getPrice() > robot3.getPrice()) {
                System.out.println("Most expensive robot - " + robot1.getName() + "\nCost: " + robot1.getPrice());
            } else {
                System.out.println("Most expensive robot - " + robot3.getName() + "\nCost: " + robot3.getPrice());
            }
        } else {
            if (robot2.getPrice() > robot3.getPrice()) {
                System.out.println("Most expensive robot - " + robot2.getName() + "\nCost: " + robot2.getPrice());
            } else {
                System.out.println("Most expensive robot - " + robot3.getName() + "\nCost: " + robot3.getPrice());
            }
        }

    }
}
