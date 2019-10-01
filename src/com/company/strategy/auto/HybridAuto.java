package com.company.strategy.auto;

import com.company.strategy.strategy.interfaces.FillStrategy;

public class HybridAuto extends Auto {
    public HybridAuto(FillStrategy fillStrategy) {
        super(fillStrategy);
    }
}
