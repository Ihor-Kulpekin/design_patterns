package com.company.abstractFabrica.factory.interfaces;

import com.company.abstractFabrica.interfaces.Chair;
import com.company.abstractFabrica.interfaces.Sofa;
import com.company.abstractFabrica.interfaces.Table;

public interface FurnitureFactory {
    Sofa createSofa();
    Table createTable();
    Chair createChair();
}
