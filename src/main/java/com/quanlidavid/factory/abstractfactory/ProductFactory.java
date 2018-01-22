package com.quanlidavid.factory.abstractfactory;

import com.quanlidavid.factory.simplefactory.IProduct;

public class ProductFactory implements IProductFactory {
    public IProduct createProduct(int productNo) {
        IProductFactory factory = null;
        if (productNo == 1) {
            factory = new ProductFactory1();
        } else if (productNo == 2) {
            factory = new ProductFactory2();
        } else if (productNo == 3) {
            factory = new ProductFactory3();
        }
        if (factory != null) {
            return factory.createProduct(productNo);
        }
        return null;
    }
}
