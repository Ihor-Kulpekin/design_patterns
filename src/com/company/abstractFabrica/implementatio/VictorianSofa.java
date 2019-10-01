package com.company.abstractFabrica.implementatio;

import com.company.abstractFabrica.interfaces.Sofa;

public class VictorianSofa implements Sofa {
    @Override
    public void nameSofa() {
        System.out.println("Victorian Sofa");
    }
}
