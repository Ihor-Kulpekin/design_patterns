package com.company.abstractFabrica.factory.implementation;

import com.company.abstractFabrica.factory.interfaces.FurnitureFactory;
import com.company.abstractFabrica.implementatio.ModernChair;
import com.company.abstractFabrica.implementatio.ModernSofa;
import com.company.abstractFabrica.implementatio.ModernTable;
import com.company.abstractFabrica.interfaces.Chair;
import com.company.abstractFabrica.interfaces.Sofa;
import com.company.abstractFabrica.interfaces.Table;

public class ModernFurnitureFactory implements FurnitureFactory {
    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }

    @Override
    public Table createTable() {
        return new ModernTable();
    }

    @Override
    public Chair createChair() {
        return new ModernChair();
    }
}
