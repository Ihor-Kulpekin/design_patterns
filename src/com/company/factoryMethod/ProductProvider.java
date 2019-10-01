package com.company.factoryMethod;

import com.company.factoryMethod.creatorProduct.interfaces.Creator;
import com.company.factoryMethod.product.interfaces.Product;

public class ProductProvider {
    private Product product;

    public ProductProvider(Creator creator) {
        this.product = creator.createProduct();
    }

    void provideProduct(){
        product.doStuff();
    }
}
