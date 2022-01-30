package com.Dawid_Kesicki;

abstract public class Device implements Saleable {

    String producer;
    String model;
    int yearOfProduction;
    String colour;
    public Double value;

    public Device(String producer, String model, int yearOfProduction, String colour) {
        this.producer = producer;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.colour = colour;
        this.value = 0.0;
    }

    public Integer getAge(){
        return 2021 - yearOfProduction;
    }

    public abstract void turnOn();

    public abstract boolean isTurnedOn();
}

