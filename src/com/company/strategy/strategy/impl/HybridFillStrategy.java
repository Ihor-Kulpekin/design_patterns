package com.company.strategy.strategy.impl;

import com.company.strategy.strategy.interfaces.FillStrategy;

public class HybridFillStrategy implements FillStrategy {
    @Override
    public void fill() {
        System.out.println("Electric and simple filling");
    }
}
