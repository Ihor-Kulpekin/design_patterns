package com.company.factoryMethod.creatorProduct.implementation;

import com.company.factoryMethod.creatorProduct.interfaces.Creator;
import com.company.factoryMethod.product.implementation.ProductB;
import com.company.factoryMethod.product.interfaces.Product;

public class CreatorB implements Creator {
    @Override
    public Product createProduct() {
        return new ProductB();
    }
}
