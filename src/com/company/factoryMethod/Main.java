package com.company.factoryMethod;

import com.company.factoryMethod.creatorProduct.implementation.CreatorA;
import com.company.factoryMethod.creatorProduct.implementation.CreatorB;

public class Main {
    public static void main(String[] args) {
        ProductProvider productProvider = new ProductProvider(new CreatorB());
        productProvider.provideProduct();

    }
}
