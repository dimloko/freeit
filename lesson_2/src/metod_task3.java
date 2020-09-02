/*Имеется 4500 секунд. Вывести в консоль содержащихся в этом количестве секунд:
А) минут + секунд,
В) часов + минут + секунд,
С) дней + часов + минут + секунд,
D) недель + дней + часов + минут + секунд.*/

public class metod_task3 {
    public static void main(String[] args) {
        int s=4500;
        int sec=s%60;
        int m=(s-sec)/60;
        System.out.println(m+" минут "+sec+" секунд");
        int min=m%60;
        int h=(m-min)/60;
        System.out.println(h+ " часов "+min+" минут "+sec+" секунд");
        int hour=h%24;
        int d=(h-hour)/24;
        System.out.println(d+" дней "+hour+ " часов "+min+" минут "+sec+" секунд");
        int day=d%7;
        int week=(d-day)/7;
        System.out.println(week+" недель "+day+" дней "+hour+ " часов "+min+" минут "+sec+" секунд");
    }
}
