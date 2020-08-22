package task27.Visa;

public class VisaGold extends Visa {
    private boolean goldStatus;

    public boolean isGoldStatus() {
        return goldStatus;
    }

    public void setGoldStatus(boolean goldStatus) {
        this.goldStatus = goldStatus;
    }

    @Override
    public String toString() {
        return "VisaGold{" +
                "goldStatus=" + goldStatus +
                ", currencyType='" + currencyType + '\'' +
                "\n"+super.toString()+'}';
    }
}
