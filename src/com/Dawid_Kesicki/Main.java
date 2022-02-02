package com.Dawid_Kesicki;

import creature.Animal;
import creature.Feedable;
import creature.Pet;

import java.sql.SQLOutput;
import java.time.chrono.HijrahChronology;
import java.util.*;

public class Main {

    public static void main(String[] args) {

        /*
        Pet dog = new Pet("Burek");
        Pet cat = new Pet("Marek");
*/
        Phone iPhone = new Phone("Apple", "iPhone 11", 2020, "Black", 8, 64);
        Phone siajomi = new Phone("Xiaomi", "MI 9 T", 2018, "Blue", 4, 64);

        Human Dawid = new Human();
        Dawid.firstName = "Dawid";
        Dawid.lastName = "Kęsicki";

        Human Karol = new Human();
        Karol.firstName = "Karol";
        Karol.lastName = "Kowalski";

        Dawid.cash = 100000.00;
        Karol.cash = 50000.00;

        Petrol mazda = new Petrol("Mazda", "RX-8", 2009, "Black");
        LPG fiat = new LPG("Fiat", "Bravo", 2016, "Black");
        Disel vw = new Disel("VW", "Passat", 2004, "Red");
        Electric tesla = new Electric("Tesla", "S", 2020, "Blue");

        Application youtube = new Application("YouTube", "12.3", 4000.0);
        Application facebook = new Application("FaceBook", "3.2", 0.0);
        Application gmail = new Application("Gmail", "1.0", 100.00);


        System.out.println(Dawid.cash);
        iPhone.installAnApp(Dawid, youtube);
        iPhone.installAnApp(Dawid, gmail);
        iPhone.installAnApp(Dawid, facebook);
        System.out.println(Dawid.cash);
        iPhone.allInstalledApp();

        /*


        mazda.value = 30000.00;
        tesla.value = 150000.00;
        fiat.value = 50000.00;
        vw.value = 10.00;




        System.out.println("Dawid ma: " + Dawid.cash + " pln");
        System.out.println("Karol ma: " + Karol.cash + " pln");

        Dawid.addCar(tesla);
        Dawid.addCar(mazda);
        Karol.addCar(fiat);
        Karol.addCar(vw);

        System.out.println("test 1");
        tesla.Sale(Dawid, Karol, 50000.00);
        System.out.println("Dawid ma: " + Dawid.cash + " pln");
        System.out.println("Karol ma: " + Karol.cash + " pln");

        System.out.println(" ");
        System.out.println("test 2");
        fiat.Sale(Karol, Dawid, 100000.00);
        System.out.println("Dawid ma: " + Dawid.cash + " pln");
        System.out.println("Karol ma: " + Karol.cash + " pln");

        System.out.println(" ");
        System.out.println("test 3");
        vw.Sale(Karol, Dawid, 60000.00);

        System.out.println(" ");
        System.out.println("test 4");
        Dawid.addCar(mazda);
        Dawid.addCar(mazda);
        Dawid.addCar(mazda);
        Dawid.addCar(tesla);

        Karol.addCar(mazda);
        Karol.addCar(mazda);
        Karol.addCar(mazda);
        Karol.addCar(tesla);

        System.out.println(" ");
        System.out.println("test 5");
        System.out.println("Wartość wszystkich aut Dawida " + Dawid.getGarageValue() + " pln");
        System.out.println("Wartość wszystkich aut Karola " + Karol.getGarageValue() + " pln");

        System.out.println(" ");
        System.out.println("test 6");
        System.out.println(Dawid.hasFreeSpace());
        System.out.println(Karol.hasFreeSpace());

        System.out.println(" ");
        System.out.println("test 7");
        System.out.println(Dawid.hasCar(mazda));
        System.out.println(Karol.hasCar(vw));

        System.out.println(" ");
        System.out.println("test 8");
        Dawid.carList();
        Dawid.removeCar(tesla);
        Dawid.carList();

        System.out.println(" ");
        System.out.println("test 9");
        Karol.carList();
        System.out.println(" ");
        Karol.sortCars();
        Karol.carList();
*/



        /*


        System.out.println(iPhone);

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
        iPhone.turnOn();
        iPhone.isTurnedOn();

        Human brotherInLow = new Human();

        brotherInLow.cash = 300000.0;

        h1.pet = cat1;
        h1.phone = iPhone;
        h1.h1 = h1;

        fiat.sale(h1, brotherInLow, 20000.0);
        iPhone.sale(h1, brotherInLow, 30000.0);
        cat1.sale(h1, brotherInLow, 100000000.0);
        h1.sale(h1, brotherInLow, 80000.0);










        List<String> apps = new ArrayList<>();
        apps.add("fb");
        apps.add("gmail");
        apps.add("instagram");
        iPhone.installAnApp("fb");


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

*/
    }
}
