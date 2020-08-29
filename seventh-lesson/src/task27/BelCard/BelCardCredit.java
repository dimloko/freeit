package task27.BelCard;

public class BelCardCredit extends BelCard {

    public void getCredit() {
        if (this.isActive()) {
            System.out.println("Вы взяли очередной кредит");
            this.balance += 1000;
        } else {
            System.out.println("Карта не активированна");
        }
    }

    @Override
    public String toString() {
        return "BelCardCredit{" +
                "balance=" + balance +
                ", isActive=" + isActive +
                ", number='" + number + '\'' +
                ", cvv='" + cvv + '\'' +
                ", userName='" + userName + '\'' +
                '}';
    }
}
