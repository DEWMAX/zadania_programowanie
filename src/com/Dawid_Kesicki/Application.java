package com.Dawid_Kesicki;

public class Application {

    public String appName;
    public String appVersion;
    public Double appPrice;
    public boolean appInstalled;

    public Application(String name, String version, Double price) {
        this.appName = name;
        this.appVersion = version;
        this.appPrice = price;
        this.appInstalled = false;
    }

    public String toString() {
        return "Nazwa aplikacji: " + appName + ", wersja: " + appVersion + ", cena: " + appPrice;
    }

    public Double getPrice() {
        return appPrice;
    }

    public String getName() {
        return appName;
    }



}