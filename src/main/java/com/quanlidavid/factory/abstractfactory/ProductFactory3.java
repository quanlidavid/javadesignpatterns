package com.quanlidavid.factory.abstractfactory;

import com.quanlidavid.factory.simplefactory.IProduct;
import com.quanlidavid.factory.simplefactory.Product3;

public class ProductFactory3 implements IProductFactory {
    public IProduct createProduct(int productNo) {
        IProduct product = new Product3();
        return product;
    }
}
