package task25;


public class Runner {
    public static void main(String[] args) {
        ATM a = new ATM(10, 10,10);
        System.out.println(a.toString());
        a.addBill20(2);
        a.addBill50(3);
        a.addBill100(5);
        System.out.println(a.toString());
        a.getCash(1270);
        System.out.println(a.toString());
        a.getCash(660);
        System.out.println(a.toString());

    }
}