package task32;

public class Symbol {
    private char value;
    private int quantity = 1;

    public Symbol(char value) {
        this.value = value;
    }

    public void addAppearance(){
        this.quantity++;
    }

    public int getQuantity() {
        return quantity;
    }

    public char getValue() {
        return value;
    }
}
