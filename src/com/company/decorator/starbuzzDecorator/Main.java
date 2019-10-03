package com.company.decorator.starbuzzDecorator;

import com.company.decorator.starbuzzDecorator.coffee.EspressoCoffee;
import com.company.decorator.starbuzzDecorator.coffee.LatteCoffee;
import com.company.decorator.starbuzzDecorator.decoratorCoffee.BaseCoffeDecorator;
import com.company.decorator.starbuzzDecorator.decoratorCoffee.ChocolateCoffeDecorator;

public class Main {
    public static void main(String[] args) {
        BaseCoffeDecorator baseCoffeDecorator = new ChocolateCoffeDecorator(
                new ChocolateCoffeDecorator(new LatteCoffee()));

        // Cost of Coffee will be 36(LatteCoffee - 26, chocolate - 5, chocolate - 5)
        System.out.println(baseCoffeDecorator.cost());
    }
}
