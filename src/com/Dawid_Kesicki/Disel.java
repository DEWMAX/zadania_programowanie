package com.Dawid_Kesicki;

public class Disel extends Car{
    public Disel(String producer, String model, int yearOfProduction, String colour) {
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
