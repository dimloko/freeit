package task27;

import task27.BelCard.BelCardCredit;
import task27.BelCard.BelCardDebet;
import task27.Visa.VisaElectron;
import task27.Visa.VisaGold;

public class CardRunner {
    public static void main(String[] args) {

        BelCardCredit credit = new BelCardCredit();
        credit.setNumber("4587 3214 5879 6589");
        credit.activation();
        credit.setUserName("Instant");
        credit.setCvv("358");
        credit.getCredit();
        System.out.println(credit.toString());

        VisaElectron electron = new VisaElectron();
        electron.setNumber("9645 7832 5478 1032");
        electron.setCurrencyType("USD");
        electron.activation();
        electron.setUserName("Dunya Kartoshkina");
        electron.setCvv("109");
        electron.set_3dSecure(true);
        System.out.println(electron.toString());

        BelCardDebet debet = new BelCardDebet();
        debet.setNumber("3587 4965 3975 3628");
        debet.showPayMessage();
        debet.activation();
        debet.showPayMessage();
        debet.setUserName("Tim Cook");
        debet.setCvv("864");
        System.out.println(debet.toString());

        VisaGold gold = new VisaGold();
        gold.setNumber("3697 8501 3633 1129");
        gold.setCvv("137");
        gold.setCurrencyType("EUR");
        gold.setGoldStatus(true);
        gold.activation();
        gold.setUserName("Rich Man");
        System.out.println(gold.toString());


    }
}
