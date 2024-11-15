package org.likz.factory;

public class CoffeeMachine {

    private final ICoffeeFactory coffeeFactory;

    public CoffeeMachine(ICoffeeFactory coffeeFactory) {
        this.coffeeFactory = coffeeFactory;
    }

    public void makeCoffee(CoffeeType coffeeType) {
        Coffee coffee = coffeeFactory.createCoffee(coffeeType);
        System.out.println("coffee is being prepared");
        System.out.println(coffee.getName() + " ready to receive!");
    }

}
