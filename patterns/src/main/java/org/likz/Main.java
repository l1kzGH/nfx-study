package org.likz;

import org.likz.adapter.*;
import org.likz.factory.CoffeeMachine;
import org.likz.factory.CoffeeType;
import org.likz.factory.ExampleCoffeeFactory;
import org.likz.factory.ICoffeeFactory;
import org.likz.proxy.ForeignDBConfig;
import org.likz.proxy.ForeignDBProxy;
import org.likz.singleton.AClass;
import org.likz.singleton.LoggerSingleton;

public class Main {

    public static void main(String[] args) {

        /**
         * Singleton realization from "singleton"-folder
         */
        AClass aClass = new AClass();
        LoggerSingleton logger = LoggerSingleton.getInstance();
        logger.classLogg(aClass, "this is new A-class");

        System.out.println("---");

        /**
         * Factory realization from "factory"-folder
         */
        ICoffeeFactory coffeeFactory = new ExampleCoffeeFactory();
        CoffeeMachine coffeeMachine = new CoffeeMachine(coffeeFactory);
        coffeeMachine.makeCoffee(CoffeeType.AMERICANO);
        coffeeMachine.makeCoffee(CoffeeType.ESPRESSO);

        System.out.println("---");

        /**
         * Adapter realization from "adapter"-folder
         */
        IComputer computer = new ExampleComputer();
        Usb usb = new Usb();
        computer.read(usb);

        SdCard sdCard = new SdCard();
        SdCardAdapter sdCardAdapter = new SdCardAdapter(sdCard);
        computer.read(sdCardAdapter);

        System.out.println("---");

        /**
         * Proxy realization from "proxy"-folder
         */
        String url = "localhost:8080";
        String dbName = "ApplesDB";
        ForeignDBConfig database = new ForeignDBConfig(url);

        /**
         * database.connect(dbName); - no proxy realization
         * or using proxy-pattern with caching data below
         */
        ForeignDBProxy foreignDBProxy = new ForeignDBProxy(database);
        foreignDBProxy.connect(dbName);
        foreignDBProxy.connect(dbName);


    }

}