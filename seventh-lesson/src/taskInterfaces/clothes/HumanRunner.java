package taskInterfaces.clothes;

import taskInterfaces.clothes.jackeet.Jacket;
import taskInterfaces.clothes.pants.Pants;
import taskInterfaces.clothes.shoes.Shoes;

public class HumanRunner {
    public static void main(String[] args) {
        Human bob = new Human("Bob", new Shoes("Vans"), new Pants("Levi's"), new Jacket("Columbia"));
        bob.getDressed();
        bob.undress();

        Human anna = new Human("Anna", new Shoes("Adidas"), new Pants("Puma"), new Jacket("Komintern"));
        anna.getDressed();
        anna.undress();
    }
}
