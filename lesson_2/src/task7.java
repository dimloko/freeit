/*В переменную записываете количество программистов.
В зависимости от количества программистов необходимо вывести правильно окончание.
Например: • 2 программиста • 1 программист • 10 программистов • и т.д.*/

public class task7 {
    public static void main(String[] args) {
        int i = 721; //Количество программистов (программисты считаются натуральными числами)
        switch (i % 10) {
            case 1:
                if(i%100==11) {
                    System.out.println(i + " программистов");
                }
                else {
                    System.out.println(i + " программист");
                }
                break;
            case 2:
                System.out.println(i + " программиста");
                break;
            case 3:
                System.out.println(i + " программиста");
                break;
            case 4:
                System.out.println(i + " программиста");
                break;
            case 5:
                System.out.println(i + " программиста");
                break;
            default:
                System.out.println(i + " программистов");
                break;
        }

    }
}
