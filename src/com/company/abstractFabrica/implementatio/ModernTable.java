package com.company.abstractFabrica.implementatio;

import com.company.abstractFabrica.interfaces.Table;

public class ModernTable implements Table {

    @Override
    public void nameTable() {
        System.out.println("Modern Table");
    }
}
