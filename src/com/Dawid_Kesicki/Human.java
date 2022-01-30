package com.Dawid_Kesicki;

import creature.Animal;
import java.util.*;

public class Human extends Animal {

    private final int DEFAULT_GARAGE_SIZE = 4;

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

    @Override
    public void Sale(Human seller, Human buyer, Double price) {

    }

    //ZADANIE 11


    //WOLNE MIEJSCA W GARAŻU
    public boolean hasFreeSpace() {
        int  counterSpace = DEFAULT_GARAGE_SIZE;
        for(Car car : this.garage){
            if(car != null){
                counterSpace -= 1;
            }
        }
        return counterSpace != 0;
    }

    //CZY AUTO JEST W GARAŻU
    public boolean hasCar(Car car){
        for(int i = 0; i< this.garage.length; i++){
            if(this.garage[i] != null && this.garage[i].equals(DEFAULT_GARAGE_SIZE)){
                return true;
            }
        }
        return false;
    }


    //USUWANIE AUTA Z GARAŻU
    public void removeCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == car) {
                this.garage[i] = null;
                i = this.garage.length;
                System.out.println(this.firstName + ", unięto " + car.producer + " " + car.model + " z garażu");
            } else {
                if (i == this.garage.length - 1) {
                    System.out.println(this.firstName + ", takiego auta nie ma w garażu!");
                }
            }
        }
    }

    //DODANIE NOWEGO AUTA
    public void addCar(Car car) {
        for (int i = 0; i < this.garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = car;
                System.out.println(this.firstName + ", auto " + car.producer + " " + car.model + " znajduje się na miejscu nr: " + i);
                i = this.garage.length;
            } else {
                if (i == this.garage.length - 1) {
                    System.out.println(this.firstName + ", brak wolnego miejsca w garażu na " + car.producer + " " + car.model);
                }
            }
        }
    }

    public Car getCar(Integer space) {
        if (space != null) {
            return garage[space];
        } else {
            return null;
        }
    }

    public void setCar(Car car, Integer space) {
        if (salary > car.value) {
            if (garage[space] != null) {
                this.garage[space] = car;
                System.out.println("kupiłeś auto za gotówkę");
            } else {
                System.out.println("to miejsce zajmuje inne auto");
            }
        } else if (salary > (car.value / 12)) {
            if (garage[space] != null) {
                this.garage[space] = car;
                System.out.println("kupiłeś auto na kredyt");
            } else {
                System.out.println("to miejsce zajmuje inne auto");
            }
        } else {
            System.out.println("masz za mało pieniędzy aby kupić auto");
        }
    }

    //SUMA WARTOŚCI AUT W GARAŻU
    public Double getGarageValue() {
        Double totalValue = 0.0;
        for (Car car : this.garage) {
            if (car != null) {
                totalValue += car.value;
            }
        }
        return totalValue;
    }

    //LISTA AUT W GARAŻU
    public void carList() {
        int counter = 0;
        System.out.println("auta znajdujące się w garażu dla " + firstName);
        for (Car car : garage) {
            if (car != null) {
                counter += 1;
                System.out.println(car.producer + " " + car.model);
            }
        }
        if (counter > 0) {
            for (int i = 0; i < garage.length; i++) {
                if (this.garage[i] != null) {
                    //System.out.println(garage[i]);

                } else {
                    System.out.println("miejsce nr: " + i + " jest puste");
                }
            }
        } else {
            System.out.println("garaż jest pusty");
        }
    }

    //Utwórz metodę sortującą samochody w garażu po roku produkcji od najstarszych do najmłodszych.
/*
    public void sortCars() {
        Car car;
        int carCounter = 0;
        Car[] provisional = new Car[DEFAULT_GARAGE_SIZE];
        }


        Integer[] array = new Integer[carCounter];
        for (Car car : garage) {
            if (car = int i;) {

            }
        }

    }
    */

    public void sortCars() {
        Car x;
        int carCounter = 0;
        Car[] provisional = new Car[DEFAULT_GARAGE_SIZE];
        for (Car car : garage) {
            if (car != null) {
                carCounter += 1;
            }
        }

        int arrayCounter = 0;
        Integer[] array = new Integer[carCounter];
        for (Car car : garage) {
            if (car != null) {
                array[arrayCounter] = car.yearOfProduction;
                arrayCounter += 1;
            }
        }

        Arrays.sort(array);
        for(int i = 0; i < array.length; i++){
            for (Car car : garage) {
                if (car != null && Objects.equals(array[i], car.yearOfProduction)) {
                    x = car;
                    provisional[i] = x;
                }
            }
        }
        garage = provisional;
    }


}