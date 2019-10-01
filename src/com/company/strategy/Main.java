package com.company.strategy;

import com.company.strategy.auto.Auto;
import com.company.strategy.auto.ElectricAuto;
import com.company.strategy.auto.HybridAuto;
import com.company.strategy.auto.SimpleAuto;
import com.company.strategy.strategy.impl.ElectricFillStrategy;
import com.company.strategy.strategy.impl.HybridFillStrategy;
import com.company.strategy.strategy.impl.StandartFillStrategy;

public class Main {
    public static void main(String[] args) {
        Auto electricAuto = new ElectricAuto(new ElectricFillStrategy());
        Auto simpleAuto = new SimpleAuto(new StandartFillStrategy());
        Auto hybridAuto = new HybridAuto(new HybridFillStrategy());
        Auto electricAuto1 = new ElectricAuto(new HybridFillStrategy());

        electricAuto.fill();
        electricAuto1.fill();
        simpleAuto.fill();
        hybridAuto.fill();
    }
}
