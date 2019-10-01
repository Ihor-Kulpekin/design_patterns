package com.company.strategy.auto;

import com.company.strategy.strategy.interfaces.FillStrategy;

public abstract class Auto {

    private FillStrategy fillStrategy;

    public Auto(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void gas(){
        System.out.println("Gas");
    }

    public void stop(){
        System.out.println("Stop moving");
    }

    public void fill(){
        fillStrategy.fill();
    }

}
