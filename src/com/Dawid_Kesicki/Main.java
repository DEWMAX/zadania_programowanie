package com.Dawid_Kesicki;

public class Main {

    public static void main(String[] args) {


        Animal dog = new Animal("Burek");
        Animal cat = new Animal("Marek");

        Car fiat = new Car("Fiat", "Bravo", 2016, "Black", 3.0) ;
        Car passerati = new Car("VW", "Passat", 2004, "Black", 3.0);
        Car firstCar = new Car("Porshe", "911", 2004, "Black", 3.0);

        Phone firstPhone = new Phone("Apple", "iPhone 11", 2020,"Black", 8, 64);

        System.out.println(firstPhone);

        Human me = new Human();
        System.out.println(me.getSalary());

        me.setSalary(600.0);

        me.Feed();
        me.GoForWalk();
        System.out.println(me.species);
        System.out.println(me.weight);

    }
}