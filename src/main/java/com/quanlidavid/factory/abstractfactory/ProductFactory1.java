package com.quanlidavid.factory.abstractfactory;

import com.quanlidavid.factory.simplefactory.IProduct;
import com.quanlidavid.factory.simplefactory.Product1;

public class ProductFactory1 implements IProductFactory {
    public IProduct createProduct(int productNo) {
        IProduct product = new Product1();
        return product;
    }
}
