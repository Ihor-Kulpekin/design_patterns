package com.company.strategy.strategy.impl;

import com.company.strategy.strategy.interfaces.FillStrategy;

public class StandartFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Simple filling");
    }
}
