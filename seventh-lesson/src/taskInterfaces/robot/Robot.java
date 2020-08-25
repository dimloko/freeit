package taskInterfaces.robot;

import taskInterfaces.robot.hands.Hand;
import taskInterfaces.robot.heads.Head;
import taskInterfaces.robot.legs.Leg;

public class Robot {
    private Leg leg;
    private Hand hand;
    private Head head;
    private String name;

    public Robot(Leg leg, Hand hand, Head head, String name) {
        this.leg = leg;
        this.hand = hand;
        this.head = head;
        this.name = name;
    }

    public Leg getLeg() {
        return leg;
    }

    public void setLeg(Leg leg) {
        this.leg = leg;
    }

    public Hand getHand() {
        return hand;
    }

    public void setHand(Hand hand) {
        this.hand = hand;
    }

    public Head getHead() {
        return head;
    }

    public void setHead(Head head) {
        this.head = head;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void actions() {
        System.out.println("************************");
        System.out.println(this.name + " actions:");
        this.head.action();
        this.hand.action();
        this.leg.action();
        System.out.println("************************");
        System.out.println();
    }

    public int getPrice() {
        return this.hand.getPrice() + this.leg.getPrice() + this.head.getPrice();
    }
}
