package com.company.decorator.starbuzzDecorator.decoratorCoffee;

import com.company.decorator.starbuzzDecorator.coffee.Coffee;

public class ChocolateCoffeDecorator extends BaseCoffeDecorator {

    private Coffee coffee;

    public ChocolateCoffeDecorator(Coffee coffee) {
        super(coffee);
        this.coffee = coffee;
    }

    @Override
    public int cost() {
        return coffee.cost()+5;
    }
}
