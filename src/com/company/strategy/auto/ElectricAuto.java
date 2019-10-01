package com.company.strategy.auto;

import com.company.strategy.strategy.interfaces.FillStrategy;

public class ElectricAuto extends Auto {
    public ElectricAuto(FillStrategy fillStrategy) {
        super(fillStrategy);
    }
}
