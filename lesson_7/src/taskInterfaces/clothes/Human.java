package taskInterfaces.clothes;

import taskInterfaces.clothes.jackeet.Jacket;
import taskInterfaces.clothes.pants.Pants;
import taskInterfaces.clothes.shoes.Shoes;

public class Human {
    private String name;
    private Shoes shoes;
    private Pants pants;
    private Jacket jacket;

    public Human(String name, Shoes shoes, Pants pants, Jacket jacket) {
        this.name = name;
        this.shoes = shoes;
        this.pants = pants;
        this.jacket = jacket;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Shoes getShoes() {
        return shoes;
    }

    public void setShoes(Shoes shoes) {
        this.shoes = shoes;
    }

    public Pants getPants() {
        return pants;
    }

    public void setPants(Pants pants) {
        this.pants = pants;
    }

    public Jacket getJacket() {
        return jacket;
    }

    public void setJacket(Jacket jacket) {
        this.jacket = jacket;
    }

    public void getDressed(){
        System.out.println("*******************************");
        System.out.println(this.name + " put on");
        this.jacket.dress();
        this.shoes.dress();
        this.pants.dress();
        System.out.println("*******************************");
    }

    public void undress(){
        System.out.println("*******************************");
        System.out.println(this.name + " take off");
        this.jacket.takeOff();
        this.shoes.takeOff();
        this.pants.takeOff();
        System.out.println("*******************************");
    }

}
