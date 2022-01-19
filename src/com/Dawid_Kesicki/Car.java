package com.Dawid_Kesicki;

public class Car extends Device{

    Double engineVolume;
    private String plates;

    public Car(String producer, String model, int yearOfProduction, String colour, Double engineVolume) {
        super(producer, model, yearOfProduction, colour);
        this.engineVolume = engineVolume;
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

}

