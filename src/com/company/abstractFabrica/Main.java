package com.company.abstractFabrica;

import com.company.abstractFabrica.factory.implementation.ModernFurnitureFactory;
import com.company.abstractFabrica.factory.implementation.VictorianFurnitureFactory;
import com.company.abstractFabrica.factory.interfaces.FurnitureFactory;
import com.company.abstractFabrica.implementatio.ModernChair;

public class Main {
    public static void main(String[] args) {
        ModernFurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();
        Furniture furniture = new Furniture(new VictorianFurnitureFactory());
        furniture.paintSofa();
        furniture.paintChair();
    }
}
