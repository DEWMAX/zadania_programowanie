package com.Dawid_Kesicki;

public class Human extends Animal{
    String firstName;
    String lastName;
    private Double salary;

    public Double getSalary(){
        return salary;
    }

    public Human(){
        super("homo sapiens");
        this.salary = 0.0;
    }
    public void setSalary(Double salary) {
        this.salary = salary;

    }
}