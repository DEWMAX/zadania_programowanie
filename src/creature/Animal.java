package creature;

import com.Dawid_Kesicki.Human;
import com.Dawid_Kesicki.Saleable;
import creature.Edbile;

public abstract class Animal implements Saleable, Edbile {
    public String species;
    private boolean canFly;
    private int legs;
    public boolean isAlive;
    public double weight;

    public Animal(String species) {
        this.species = species;
        this.canFly = canFly;
        this.legs = legs;
        this.isAlive = isAlive;
        this.weight = weight;
    }

    public void Feed() {
        if(!this.isAlive) {
            System.out.println("Nie mozesz nakarmic martwego zwierzaka, halo policja!!");
            return;
        }
        this.weight += 1.0;
        System.out.println(this.species + " nakarmiony, teraz wazy " + this.weight + "kg");
    }

    public void GoForWalk() {
        if(!this.isAlive) {
            System.out.println("Nie mozesz wyprowadzic martwego zwierzaka, halo policja!!");
            return;
        }

        this.weight -= 1.0;
        if(this.weight <= 0.0) {
            this.isAlive = false;
            System.out.println(this.species + " umarl");
        }
    }
    @Override
    public void sale(Human seller, Human buyer, Double price){
        if(buyer.cash < price){
            System.out.println("Sorry, nie masz kasy");
        } else if (seller.pet != this){
            System.out.println("Sorry, ale nie masz zwierzaka");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.pet = null;
            buyer.pet = this;
            System.out.println("Udało się sprzedać zwierzaka za " + price + " pln");
        }
    }

    @Override
    public void beEaten(Animal animal){

    }

}
