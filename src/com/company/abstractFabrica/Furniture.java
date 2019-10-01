package com.company.abstractFabrica;

import com.company.abstractFabrica.factory.interfaces.FurnitureFactory;
import com.company.abstractFabrica.interfaces.Chair;
import com.company.abstractFabrica.interfaces.Sofa;
import com.company.abstractFabrica.interfaces.Table;

public class Furniture {
    private Sofa sofa;
    private Table table;
    private Chair chair;


    Furniture(FurnitureFactory furnitureFactory){
        this.sofa = furnitureFactory.createSofa();
        this.table = furnitureFactory.createTable();
        this.chair = furnitureFactory.createChair();
    }

    void paintSofa(){
        sofa.nameSofa();
    }
    void paintTable(){
        table.nameTable();
    }
    void paintChair(){
        chair.nameChair();
    }
}
