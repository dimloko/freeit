package task25;

public class ATM {
    int numberOfBill20;
    int numberOfBill50;
    int numberOfBill100;

    public ATM(int numberOfBill20, int numberOfBill50, int numberOfBill100) {
        this.numberOfBill20 = numberOfBill20;
        this.numberOfBill50 = numberOfBill50;
        this.numberOfBill100 = numberOfBill100;
    }

    @Override
    public String toString() {
        return "ATM{" +
                "numberOfBill20=" + numberOfBill20 +
                ", numberOfBill50=" + numberOfBill50 +
                ", numberOfBill100=" + numberOfBill100 +
                '}';
    }

    public void addBill20(int quantity20) {
        this.numberOfBill20 += quantity20;
        System.out.println("Added " + quantity20 + " bills of 20");
        System.out.println("Total at ATM " + this.numberOfBill20 + " bills of 20");
        System.out.println();
    }

    public void addBill50(int quantity50) {
        this.numberOfBill50 += quantity50;
        System.out.println("Added " + quantity50 + " bills of 50");
        System.out.println("Total at ATM " + this.numberOfBill50 + " bills of 50");
        System.out.println();
    }

    public void addBill100(int quantity100) {
        this.numberOfBill100 += quantity100;
        System.out.println("Added " + quantity100 + " bills of 100");
        System.out.println("Total at ATM " + this.numberOfBill100 + " bills of 100");
        System.out.println();
    }

    public boolean getCash(int sum) {
        System.out.println("*******\n Trying to get cash from ATM:" + sum);
        int tmpSum = sum;
        int sumW100; //сумма, за вычетом сотенных купюр
        int n20 = 0;
        int n50 = 0;
        int n100 = 0;
        if (sum % 10 != 0 || sum <= 0) {
            System.out.println("Impossible to issue this amount");
            System.out.println();
            return false;
        }

        //Выдаём сотки
        if (this.numberOfBill100 != 0 && sum >= 100) {
            sum -= sum % 100;
            n100 = sum / 100;
            if (n100 > this.numberOfBill100) {
                n100 = this.numberOfBill100;
            }
            sum = tmpSum - (n100 * 100);
        }

        sumW100 = sum; //На случай, если не получится выдать остаток 50-ми и 20-ми, попробуем выдать только 20-ми

        //Вдаём пятидесятки
        if (this.numberOfBill50 != 0 && sum >= 50) {
            sum -= sum % 50;
            n50 = sum / 50;
            if (n50 > this.numberOfBill50) {
                n50 = this.numberOfBill50;
            }
            sum = tmpSum - (n100 * 100 + n50 * 50);
        }

        //выдаём двадцатки
        if (this.numberOfBill20 != 0 && sum >= 20) {
            sum -= sum % 20;
            n20 = sum / 20;
            if (n20 > this.numberOfBill20) {
                n20 = this.numberOfBill20;
            }
            sum = tmpSum - (n100 * 100 + n50 * 50 + n20*20);
        }

        //Елси сумма не сошлась, пробуем выдать 20-ми
        if(sum!=0 && sumW100%20==0){
            n50=0;
            sumW100 -= sumW100 % 20;
            n20 = sumW100 / 20;
            if (n20 > this.numberOfBill20) {
                n20 = this.numberOfBill20;
            }
            sum = tmpSum - (n100 * 100 + n50 * 50 + n20*20);
        }

        //Если сумма сошлась - выдаём деньги
        if (sum == 0){
            if(n20!=0) {
                System.out.printf("%d bills of 20 denomination were issued\n", n20);
                this.numberOfBill20 -= n20;
            }
            if(n50!=0) {
                System.out.printf("%d bills of 50 denomination were issued\n", n50);
                this.numberOfBill50 -= n50;
            }
            if(n100!=0) {
                System.out.printf("%d bills of 100 denomination were issued\n", n100);
                this.numberOfBill100 -= n100;
            }
            System.out.println();
            return true;
        }

        //Если дошли до этого места, значит нет возможности выдать данную сумму
        System.out.println("Impossible to issue this amount");
        System.out.println();
        return false;
    }
}