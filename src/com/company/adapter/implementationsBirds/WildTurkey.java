package com.company.adapter.implementationsBirds;

import com.company.adapter.bird.Turkey;

public class WildTurkey implements Turkey {


    @Override
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    @Override
    public void fly() {
        System.out.println("I'm flying short distance");
    }
}
