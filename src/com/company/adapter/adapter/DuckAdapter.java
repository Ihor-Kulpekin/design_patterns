package com.company.adapter.adapter;

import com.company.adapter.bird.Duck;
import com.company.adapter.bird.Turkey;

public class DuckAdapter implements Turkey {


    private Duck duck;

    public DuckAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void gobble() {
        duck.quack();
    }

    @Override
    public void fly() {
        duck.fly();
    }
}
