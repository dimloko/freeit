package task27.BelCard;

public class BelCardDebet extends BelCard {
    public void showPayMessage() {
        if (this.isActive()) {
            System.out.println("Пришла зарплатка");
            this.balance += 1000000;
        } else {
            System.out.println("Карта не активирована");
        }
    }

    @Override
    public String toString() {
        return "BelCardDebet{" + "\n" +
                super.toString() +
                '}';
    }
}
