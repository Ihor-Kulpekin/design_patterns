package com.company.strategy.auto;

import com.company.strategy.strategy.interfaces.FillStrategy;

public class SimpleAuto extends Auto {
    public SimpleAuto(FillStrategy fillStrategy) {
        super(fillStrategy);
    }
}
