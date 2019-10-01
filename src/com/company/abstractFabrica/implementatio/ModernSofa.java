package com.company.abstractFabrica.implementatio;

import com.company.abstractFabrica.interfaces.Sofa;

public class ModernSofa implements Sofa {
    @Override
    public void nameSofa() {
        System.out.println("Modern Sofa");
    }
}
