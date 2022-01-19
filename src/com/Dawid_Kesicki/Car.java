package com.Dawid_Kesicki;

public class Car extends Device implements Saleable{

    Double engineVolume;
    private String plates;

    public Car(String producer, String model, int yearOfProduction, String colour, Double engineVolume) {
        super(producer, model, yearOfProduction, colour);
        this.engineVolume = 1.3;
    }

    public String toString() {
        return "Producent: " + this.producer + ", model: " + this.model;
    }

    @Override
    public void turnOn() {
        System.out.println("Przekręcam kluczyk");
        System.out.println("silnik odpalił niczym żyleta");
    }

    @Override
    public boolean isTurnedOn() {
        return false;
    }
    public void sale(Human seller, Human buyer, Double price){
        if(buyer.cash < price){
            System.out.println("Sorry, nie masz kasy");
        } else if (seller.car != this){
            System.out.println("Sorry, ale nie masz samochodu");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.car = null;
            buyer.car = this;
            System.out.println("Udało się sprzedać auto za " + price + " pln");
        }
    }
}

