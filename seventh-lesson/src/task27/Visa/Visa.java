package task27.Visa;

import task27.Card;

public class Visa extends Card {

    String currencyType;

    private boolean isActive;

    @Override
    public void activation() {
        System.out.println("This card has been activated");
        this.isActive = true;
    }

    @Override
    public void deactivation() {
        System.out.println("This card has been deactivated");
        this.isActive = false;
    }

    @Override
    public boolean isActive() {
        return isActive;
    }

    public String getCurrencyType() {
        return currencyType;
    }

    public void setCurrencyType(String currencyType) {
        this.currencyType = currencyType;
    }

    @Override
    public String toString() {
        return "Visa{" +
                "currencyType='" + currencyType + '\'' +
                ", isActive=" + isActive +
                "\n" + super.toString() + '}';
    }
}
