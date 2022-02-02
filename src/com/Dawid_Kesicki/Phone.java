package com.Dawid_Kesicki;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.*;

import com.Dawid_Kesicki.*;

public class Phone extends Device implements Saleable{

    static final String DEFAULT_APP_SERVER = "https://www.appstore.com/apps";
    static final int DEFAULT_PROTOCOL = 25565;
    static final String DEFAULT_VERSION_NAME = "my app";
    final int ram;
    final String ramText;
    int totalStorage;

    public List<Application> appList;


    String DEFAULT_APP_VERSION = "1.0";

    public Phone(String producer, String model, int yearOfProduction, String colour, int ram, int totalStorage) {

        super(producer, model, yearOfProduction, colour);
        this.ram = ram;
        this.totalStorage = totalStorage;
        this.ramText = ram + "GB";
        this.appList = new ArrayList<>();
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

    @Override
    public void Sale(Human seller, Human buyer, Double price) {

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
            //this.installAnApp(url);
        } catch (MalformedURLException e) {
            System.out.println("nie udało się zainstalować aplikacji");
            e.printStackTrace();
        }
    }

    public void installAnApp(Human human, Application appName){
        if(human.cash > appName.appPrice){
            if(appList.contains(appName)){
                System.out.println("Ta aplikacja jest juz zainstalowana - " + appName.appName);
            }else{
                appList.add(appName);
                human.cash -= appName.appPrice;
                System.out.println("sprawdzanie adresu docelowego");
                System.out.println("sprawdzanie rozmiaru aplikacji");
                System.out.println("sprawdzanie miejsca na telefonie");
                System.out.println("obsługa płatności");
                System.out.println("pobieranie aplikacji");
                System.out.println("rozpakowanie aplikacji");
                System.out.println("instalacja " + appName.appName);
                appName.appInstalled = true;
            }
        }
    }


    public boolean appInstalled(Application appName){
        return appName.appInstalled;
    }
    public boolean appIsInstalled(String appName){
        for (Application app: appList) {
            if(Objects.equals(app.appName, appName) && app.appInstalled){
                return true;
            }
        }
        return false;
    }

    public void freeApps(){
        System.out.println("darmowe aplikacje: ");
        int counter = 0;
        for (Application app:appList) {
            if(app.appPrice == 0.0){
                System.out.println("1) " + app);
                counter += 1;
            }
        }
        if(counter == 0){
            System.out.println("brak darmowych aplikacji!");
        }
    }

    public Double valueInstalledApps(){
        double value = 0.0;
        for (Application app:appList) {
            if(app.appInstalled){
                value += app.appPrice;
            }
        }
        return value;
    }


    public void InstalledApps(){
        System.out.println("aplikacje posortowane alfabetycznie: ");
        String[] tempNames = new String[appList.size()];
        int x = 0;
        for (Application app:appList) {
            if(app.appInstalled){
                tempNames[x] = app.appName;
                x += 1;
            }
        }
        Arrays.sort(tempNames);
        for(int i = 0; i < tempNames.length; i ++){
            System.out.println(i+1 + " " + tempNames[i]);
        }
    }

    public void allInstalledApp(){
        Double[] tempPrices = new Double[appList.size()];
        System.out.println("aplikacje posortowane od najtańszej do najdroższej: ");
        int x = 0;
        for (Application app:appList) {
            if(app.appInstalled){
                tempPrices[x] = app.appPrice;
                x += 1;
            }
        }
        Arrays.sort(tempPrices);
        for(int i = 0; i < tempPrices.length; i ++){
            System.out.println(i+1 + ") " + tempPrices[i]);
        }
    }
}