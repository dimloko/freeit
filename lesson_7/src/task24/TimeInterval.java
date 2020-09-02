package task24;

public class TimeInterval {
    int hour;
    int minute;
    int second;

    public TimeInterval(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    public TimeInterval(int second) {
        this.second = second % 60;
        second -= this.second;
        this.minute = second / 60;
        this.hour = this.minute / 60;
        this.minute -= hour * 60;

    }

    //Возвращает колличество секунд в промежутке
    public int howSecond() {

        return 3600 * this.hour + 60 * this.minute + this.second;
    }

    @Override
    public String toString() {
        return "task25.TimeInterval{" +
                "hour=" + hour +
                ", minute=" + minute +
                ", second=" + second +
                '}';
    }

    //Разница в секундах
    public int compareInterval(TimeInterval anotherInterval) {

        return this.howSecond() - anotherInterval.howSecond();
    }
}
