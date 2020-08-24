package task27;


public abstract class Card {
    protected String number;
    protected String cvv;
    protected String userName;

    public abstract void activation();

    public abstract void deactivation();

    public abstract boolean isActive();

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getCvv() {
        return cvv;
    }

    public void setCvv(String cvv) {
        this.cvv = cvv;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

}
