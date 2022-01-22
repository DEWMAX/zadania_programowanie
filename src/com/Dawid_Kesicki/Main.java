package com.Dawid_Kesicki;

import creature.Animal;
import creature.Feedable;
import creature.Pet;

import java.time.chrono.HijrahChronology;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {


        Pet dog = new Pet("Burek");
        Pet cat = new Pet("Marek");

        Car fiat = new Car("Fiat", "Bravo", 2016, "Black", 3.0);
        Car passerati = new Car("VW", "Passat", 2004, "Black", 3.0);
        Car firstCar = new Car("Porshe", "911", 2004, "Black", 3.0);

        Phone firstPhone = new Phone("Apple", "iPhone 11", 2020, "Black", 8, 64);

        System.out.println(firstPhone);

        Human h1 = new Human();

        h1.setSalary(500000.0);
        System.out.println(h1.getSalary());


        h1.feed();
        h1.GoForWalk();
        System.out.println(h1.species);
        System.out.println(h1.weight);
        System.out.println(fiat.getAge());

        Pet cat1 = new Pet("felis");

        fiat.turnOn();
        fiat.isTurnedOn();
        firstPhone.turnOn();
        firstPhone.isTurnedOn();

        Human brotherInLow = new Human();

        brotherInLow.cash = 300000.0;
        h1.car = fiat;
        h1.pet = cat1;
        h1.phone = firstPhone;
        h1.h1 = h1;

        fiat.sale(h1, brotherInLow, 20000.0);
        firstPhone.sale(h1, brotherInLow, 30000.0);
        cat1.sale(h1, brotherInLow, 100000000.0);
        h1.sale(h1, brotherInLow, 80000.0);


        List<String> apps = new ArrayList<>();
        apps.add("fb");
        apps.add("gmail");
        apps.add("instagram");
        firstPhone.installAnApp("fb");
    }



}