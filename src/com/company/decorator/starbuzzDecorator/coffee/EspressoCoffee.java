package com.company.decorator.starbuzzDecorator.coffee;

import com.company.decorator.starbuzzDecorator.coffee.Coffee;

public class EspressoCoffee implements Coffee {

    @Override
    public int cost() {
        return 25;
    }
}
