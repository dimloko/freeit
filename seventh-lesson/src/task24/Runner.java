package task24;

public class Runner {
    public static void main(String[] args) {
        TimeInterval t1 = new TimeInterval(0, 57, 36);
        TimeInterval t2 = new TimeInterval(3965);
        System.out.println(t1.toString());
        System.out.println(t2.toString());
        System.out.println("В интервале t1 - " + t1.howSecond() + "секунд");
        System.out.println("В интервале t1 - " + t2.howSecond() + "секунд");
        System.out.println("Разница - " + t1.compareInterval(t2) + "секунд");
    }
}
