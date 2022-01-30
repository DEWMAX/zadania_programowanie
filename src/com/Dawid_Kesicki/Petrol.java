package com.Dawid_Kesicki;

public class Petrol extends Car{
    public Petrol(String producer, String model, int yearOfProduction, String colour) {
        super(producer, model, yearOfProduction, colour);
    }

    @Override
    public boolean isTurnedOn() {
        return false;
    }

    @Override
    public void refuel() {

    }

    @Override
    public void sale(Human seller, Human buyer, Double price) {

    }
}
