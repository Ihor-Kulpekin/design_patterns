package com.company.factoryMethod.product.implementation;

import com.company.factoryMethod.product.interfaces.Product;

public class ProductA implements Product {
    @Override
    public void doStuff() {
        System.out.println("It is a ProductA");
    }
}
