package com.company.abstractFabrica.factory.implementation;

import com.company.abstractFabrica.factory.interfaces.FurnitureFactory;
import com.company.abstractFabrica.implementatio.VictorianChair;
import com.company.abstractFabrica.implementatio.VictorianSofa;
import com.company.abstractFabrica.implementatio.VictorianTable;
import com.company.abstractFabrica.interfaces.Chair;
import com.company.abstractFabrica.interfaces.Sofa;
import com.company.abstractFabrica.interfaces.Table;

public class VictorianFurnitureFactory implements FurnitureFactory {
    @Override
    public Sofa createSofa() {
        return new VictorianSofa();
    }

    @Override
    public Table createTable() {
        return new VictorianTable();
    }

    @Override
    public Chair createChair() {
        return new VictorianChair();
    }
}
