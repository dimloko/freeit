package generics;


import java.util.ArrayList;

public class ArrBox<T> {
    private ArrayList<T> array = new ArrayList<>();

    public void add(T element) {
        array.add(element);
    }

    public T get(int index) {
        if (index > array.size()) {
            System.out.println("Элемента с таким номером не существует");
        }
        return array.get(index);
    }

    public String out() {
        return array.toString();
    }
}

