package com.company.factoryMethod.creatorProduct.implementation;

import com.company.factoryMethod.creatorProduct.interfaces.Creator;
import com.company.factoryMethod.product.implementation.ProductA;
import com.company.factoryMethod.product.interfaces.Product;

public class CreatorA implements Creator {
    @Override
    public Product createProduct() {
        return new ProductA();
    }
}
