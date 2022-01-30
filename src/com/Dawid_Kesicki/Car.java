package com.Dawid_Kesicki;

import java.util.*;

public abstract class Car extends Device implements Saleable{

    public Double engineVolume;
    public String engineType;
    public String plates;
    public Double value;
    public Double oil;
    public Double capacitance;
    public Double gas;

    //zad 12
    public List<Human> ownersList;
    public List<Human> buyersList;
    public List<Human> sellersList;
    public List<String> transactionsList;
    public Human owner;


    public Car(String producer, String model, int yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
        this.engineVolume = 1.3;
        this.engineType = "rotary";
        this.plates = "N0 ROTOR";
        this.value = 0.0;
        this.oil = 0.0;
        this.capacitance = 0.0;
        this.gas = 0.0;
        this.ownersList = new ArrayList<>();
        this.buyersList = new ArrayList<>();
        this.sellersList = new ArrayList<>();
        this.transactionsList = new ArrayList<>();
        this.owner = null;
    }

    @Override
    public void turnOn() {
        System.out.println("Przekręcam kluczyk");
        System.out.println("silnik odpalił niczym żyleta");
        System.out.println("silnik pracuje na wolnych obrotach");
    }


    // Zmień metodę Car.sell(Human seller, Human buyer, Double price) tak, aby zawierała:

    @Override
    public void Sale(Human seller, Human buyer, Double price){
        if(buyer.cash < price){
            System.out.println("Sorry, nie masz kasy");
        } else if (seller.hasCar(this)){
            System.out.println("Sorry, ale nie masz samochodu");
        }else if(!buyer.hasFreeSpace()){
            System.out.println("Sorry, ale nie masz miejsca w garażu");
        }else if(seller != owner){
            System.out.println("DZWONIĘ DO PROKURATURY!!!");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            this.ownersList.add(buyer);
            this.buyersList.add(buyer);
            this.sellersList.add(seller);
            this.transactionsList.add("były właściciel: " + seller.firstName + " nowy właściciel: " + buyer.firstName + " auta: " );
            System.out.println("Udało się sprzedać auto za " + price + " pln");
        }
    }

     public abstract void refuel();

    public boolean checkOwners(){
        return ownersList.size() != 0;
    }

    public void carOwners(){
        System.out.println(" byli właściciele pojazdu: " + this);
        int counter = 1;
        if(ownersList.size() == 0){
            System.out.println(" auto nie posiada właściciela");
        }else{
            for (Human human : ownersList) {
                if(counter == ownersList.size()){
                    this.owner = human;
                    System.out.println(counter + " " + this.owner + " aktualny właściciel pojazdu");
                }else{
                    System.out.println(counter + " " + human);
                    counter += 1;
                }
            }
        }
    }

    public Integer transactionCount(){
        int counter = 0;
        for (String transaction : transactionsList) {
            counter += 1;
        }
        return counter;
    }

    public boolean checkSelling(Human seller, Human buyer){
        for (int i = 0; i < transactionCount(); i++) {
            if(sellersList.contains(seller) && buyersList.contains(buyer))
                if(sellersList.get(i) == seller && buyersList.get(i) == buyer){
                    return true;
                }
        }
        return false;
    }


}

