package com.Dawid_Kesicki;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements Saleable{

    static final String DEFAULT_APP_SERVER = "https://www.appstore.com/apps";
    static final int DEFAULT_PROTOCOL = 25565;
    static final String DEFAULT_VERSION_NAME = "my app";
    final int ram;
    final String ramText;
    int totalStorage;




    String DEFAULT_APP_VERSION = "1.0";

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
    public void sale(Human seller, Human buyer, Double price){
        if(buyer.cash < price){
            System.out.println("Sorry, nie masz kasy");
        } else if (seller.phone != this){
            System.out.println("Sorry, ale nie masz telefonu");
        } else {
            seller.cash += price;
            buyer.cash -= price;
            seller.phone = null;
            buyer.phone = this;
            System.out.println("Udało się sprzedać telefon za " + price + " pln");
        }
    }

    public void installAnApp(List<String> appNames){
for(String appName : appNames){
    this.installAnApp(appName);
}
    }

    public void installAnApp(String appName){
        System.out.println("instalowanie aplikacji wg nazwy: " + appName);
        this.installAnApp(appName, DEFAULT_APP_VERSION);
    }

    public void installAnApp(String appName, String version){
        System.out.println("instalowania aplikacji wg nazwy: "+appName + " i wersji: "+ version);
this.installAnApp(appName, version, DEFAULT_APP_SERVER);
    }

    public void installAnApp(String appName, String version, String server){
        System.out.println("instalowania aplikacji wg nazwy: "+appName + " i wersji: "+ version + " i serwera: " + server);
        try {
            URL url = new URL("https", server, 443, appName + "-" + version);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            System.out.println("nie udało się zainstalować aplikacji");
            e.printStackTrace();
        }
    }



    public void installAnApp(URL url){
        System.out.println("sprawdzanie adresu docelowego");
        System.out.println("sprawdzanie rozmiaru aplikacji");
        System.out.println("sprawdzanie miejsca na telefonie");
        System.out.println("obsługa płatności");
        System.out.println("pobieranie aplikacji");
        System.out.println("rozpakowanie aplikacji");
        System.out.println("instalacja");
    }
}