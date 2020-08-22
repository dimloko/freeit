package task27.BelCard;

import task27.Card;

public class BelCard extends Card {

    int balance;

    private boolean isActive;

    @Override
    public void activation() {
        System.out.println("Гэтая карта была актываваная");
        this.isActive = true;

    }

    @Override
    public void deactivation() {
        System.out.println("Гэтая карта была дэактываваная");
        this.isActive = true;

    }

    @Override
    public boolean isActive() {
        return this.isActive;
    }


    public int getBalance() {
        return balance;
    }

    @Override
    public String toString() {
        return "BelCard{" +
                "balance=" + balance +
                ", isActive=" + isActive +
                "\n" + super.toString() + '}';
    }
}
