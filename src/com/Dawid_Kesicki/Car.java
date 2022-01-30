package com.Dawid_Kesicki;

public abstract class Car extends Device implements Saleable{

    public Double engineVolume;
    public String engineType;
    public String plates;
    public Double value;
    public Double oil;
    public Double capacitance;
    public Double gas;

    public Car(String producer, String model, int yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
        this.engineVolume = 1.3;
        this.engineType = "rotary";
        this.plates = "N0 ROTOR";
        this.value = 0.0;
        this.oil = 0.0;
        this.capacitance = 0.0;
        this.gas = 0.0;
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
            System.out.println("Sorry, ale nie masz miejsca w gararzu");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.removeCar(this);
            buyer.addCar(this);
            System.out.println("Udało się sprzedać auto za " + price + " pln");
        }
    }

     public abstract void refuel();
}

