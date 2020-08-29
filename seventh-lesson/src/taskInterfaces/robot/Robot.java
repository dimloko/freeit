package taskInterfaces.robot;

import taskInterfaces.robot.hands.IHand;
import taskInterfaces.robot.heads.IHead;
import taskInterfaces.robot.legs.ILeg;

public class Robot {
    private ILeg leg;
    private IHand hand;
    private IHead head;
    private String name;

    public Robot(ILeg leg, IHand hand, IHead head, String name) {
        this.leg = leg;
        this.hand = hand;
        this.head = head;
        this.name = name;
    }

    public ILeg getLeg() {
        return leg;
    }

    public void setLeg(ILeg leg) {
        this.leg = leg;
    }

    public IHand getHand() {
        return hand;
    }

    public void setHand(IHand hand) {
        this.hand = hand;
    }

    public IHead getHead() {
        return head;
    }

    public void setHead(IHead head) {
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
        return this.hand.getPRICE() + this.leg.getPRICE() + this.head.getPRICE();
    }
}
