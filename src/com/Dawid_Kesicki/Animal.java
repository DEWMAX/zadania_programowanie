package com.Dawid_Kesicki;

public class Animal {
    String species;
    private boolean canFly;
    private int legs;
    private boolean isAlive;
    double weight;

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

}
