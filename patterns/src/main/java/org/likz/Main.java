package org.likz;

import org.likz.adapter.*;
import org.likz.factory.ExampleCoffeeFactory;
import org.likz.factory.CoffeeMachine;
import org.likz.factory.CoffeeType;
import org.likz.factory.ICoffeeFactory;
import org.likz.singleton.AClass;
import org.likz.singleton.LoggerSingleton;

public class Main {

    public static void main(String[] args) {

        // Singleton
        AClass aClass = new AClass();
        LoggerSingleton logger = LoggerSingleton.getInstance();
        logger.classLogg(aClass, "this is new A-class");

        System.out.println("---");

        //Factory
        ICoffeeFactory coffeeFactory = new ExampleCoffeeFactory();
        CoffeeMachine coffeeMachine = new CoffeeMachine(coffeeFactory);
        coffeeMachine.makeCoffee(CoffeeType.AMERICANO);
        coffeeMachine.makeCoffee(CoffeeType.ESPRESSO);

        System.out.println("---");

        //Adapter
        IComputer computer = new ExampleComputer();
        Usb usb = new Usb();
        computer.read(usb);

        SdCard sdCard = new SdCard();
        SdCardAdapter sdCardAdapter = new SdCardAdapter(sdCard);
        computer.read(sdCardAdapter);

        



    }

}