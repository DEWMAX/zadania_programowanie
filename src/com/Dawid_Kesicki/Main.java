package com.Dawid_Kesicki;

import creature.Animal;
import creature.Feedable;
import creature.Pet;

import java.time.chrono.HijrahChronology;
import java.util.*;

public class Main {

    public static void main(String[] args) {


        Pet dog = new Pet("Burek");
        Pet cat = new Pet("Marek");

        LPG fiat = new LPG("Fiat", "Bravo", 2016, "Black", 3.0);
        Disel passerati = new Disel("VW", "Passat", 2004, "Black", 3.0);
        Electric firstCar = new Electric("Porshe", "911", 2004, "Black", 3.0);

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


        Integer[] numbers = {2, 1, 3, 2};
        String[] days = {"pn", "wt", "śr", "czw"};
        Integer[] otherNumbers = new Integer[4];
        otherNumbers[0] = 2;
        otherNumbers[1] = 1;
        otherNumbers[2] = 3;
        otherNumbers[3] = 2;

        List<Integer> listOfNumbers = new LinkedList<>();
        listOfNumbers.add(2);
        listOfNumbers.add(1);
        listOfNumbers.add(15);

        Human[] family = new Human[5];
        family[0] = h1;
        family[1] = h1;
        family[2] = brotherInLow;
        System.out.println();

        List<Human> otherFamily = new LinkedList<>();
        otherFamily.add(h1);
        otherFamily.add(brotherInLow);
        otherFamily.add(h1);
        System.out.println(otherFamily.size());


        Set<Human> anotherFamily = new HashSet<>();
        anotherFamily.add(h1);
        anotherFamily.add(h1);
        anotherFamily.add(h1);
        anotherFamily.add(h1);
        anotherFamily.add(brotherInLow);
        System.out.println(anotherFamily.size());


    }



}