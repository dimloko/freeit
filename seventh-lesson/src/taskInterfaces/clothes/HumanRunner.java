package taskInterfaces.clothes;

import taskInterfaces.clothes.jackeet.Jacket;
import taskInterfaces.clothes.pants.Pants;
import taskInterfaces.clothes.shoes.Shoes;

public class HumanRunner {
    public static void main(String[] args) {
        Human h = new Human("Bob", new Shoes("Vans"), new Pants("Levi's"), new Jacket("Columbia"));
        h.getDressed();
        h.undress();
    }
}
