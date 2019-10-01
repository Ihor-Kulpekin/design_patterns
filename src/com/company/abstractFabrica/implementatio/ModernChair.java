package com.company.abstractFabrica.implementatio;

import com.company.abstractFabrica.interfaces.Chair;

public class ModernChair implements Chair {
    @Override
    public void nameChair() {
        System.out.println("Modern Chair");
    }
}
