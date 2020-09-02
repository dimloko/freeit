package task29;

public class Pupil {
    private String name;
    private int mark;

    public Pupil(String name, int mark) {
        this.name = name; //Имя ученика
        this.mark = mark; //Оценка ученика
    }

    public String getName() {
        return name;
    }

    public int getMark() {
        return mark;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", mark=" + mark;
    }
}
