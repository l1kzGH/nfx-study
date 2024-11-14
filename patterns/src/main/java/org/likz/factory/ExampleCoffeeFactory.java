package org.likz.factory;

public class ExampleCoffeeFactory implements ICoffeeFactory {

    public Coffee createCoffee(CoffeeType coffeeType) {
        Coffee coffee;
        switch (coffeeType){
            case ESPRESSO -> coffee = new Espresso();
            case AMERICANO -> coffee = new Americano();
            default -> throw new IllegalArgumentException("Invalid coffee-type");
        }
        return coffee;
    }

}
