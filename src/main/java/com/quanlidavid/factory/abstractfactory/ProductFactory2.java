package com.quanlidavid.factory.abstractfactory;

import com.quanlidavid.factory.simplefactory.IProduct;
import com.quanlidavid.factory.simplefactory.Product2;

public class ProductFactory2 implements IProductFactory {
    public IProduct createProduct(int productNo) {
        IProduct product = new Product2();
        return product;
    }
}
