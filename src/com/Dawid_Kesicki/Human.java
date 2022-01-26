package com.Dawid_Kesicki;

import creature.Animal;
import creature.Edbile;

public class Human extends Animal {
    private final int DEFAULT_GARAGE_SIZE = 4;
    public boolean hasCar(){
        for(int i = 0; i< this.garage.length; i++){
            if(this.garage[i] != null && this.garage[i].equals(newCar)){
                return true;
            }
        }
    }
    String firstName;
    String lastName;
    private Double salary;

    public Double cash;
    public Car[] garage;
    Phone phone;
    public Animal pet;
    Human h1;

    public Double getSalary(){
        return salary;
    }

    public Human(){
        super("homo sapiens");
        this.salary = 0.0;
        this.cash = 0.0;
        this.garage = new Car[DEFAULT_GARAGE_SIZE];
    }
    public void setSalary(Double salary) {
        this.salary = salary;

    }
    public void sale(Human seller, Human buyer, Double price){
        if(buyer.cash < price){
            System.out.println("Sorry, nie masz kasy");
        } else if (seller.h1 != this){
            System.out.println("Sorry, ale nie masz człowieka");
        } else {
            System.out.println("Nie wolno handlować ludźmi :/");
        }
    }
}