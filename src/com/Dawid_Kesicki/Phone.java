package com.Dawid_Kesicki;

public class Phone extends Device{

    final int ram;
    final String ramText;
    int totalStorage;

    public Phone(String producer, String model, int yearOfProduction, String colour, int ram, int totalStorage) {

        super(producer, model, yearOfProduction, colour);
        this.ram = ram;
        this.totalStorage = totalStorage;
        this.ramText = ram + "GB";
    }

    @Override
    public String toString() {
        return "Phone{" +
                "producer='" + producer + '\'' +
        ", model='" + model + '\'' +
        ", yearOfProduction=" + yearOfProduction +
                ", ramText='" + ramText + '\'' +
        ", totalStorage=" + totalStorage +
                '}';
    }

    public void turnOn(){
        System.out.println("wciskam guzik");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("czekam");
        System.out.println("o jest, logo");
    }

    public boolean isTurnedOn(){
        return true;
    }

}