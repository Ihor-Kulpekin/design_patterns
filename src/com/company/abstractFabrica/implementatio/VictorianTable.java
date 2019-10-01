package com.company.abstractFabrica.implementatio;

import com.company.abstractFabrica.interfaces.Table;

public class VictorianTable implements Table {


    @Override
    public void nameTable() {
        System.out.println("Victorian Table");
    }
}
