package com.company.abstractFabrica.implementatio;

import com.company.abstractFabrica.interfaces.Chair;

public class VictorianChair implements Chair {
    @Override
    public void nameChair() {
        System.out.println("Victorian Chair");
    }
}
