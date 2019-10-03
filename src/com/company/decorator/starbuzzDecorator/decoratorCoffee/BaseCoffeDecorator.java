package com.company.decorator.starbuzzDecorator.decoratorCoffee;

import com.company.decorator.starbuzzDecorator.coffee.Coffee;

public class BaseCoffeDecorator implements Coffee {

    private Coffee coffee;

    BaseCoffeDecorator(Coffee coffee) {
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return coffee.cost();
    }
}
