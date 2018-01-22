package com.quanlidavid.factory.abstractfactory;

import com.quanlidavid.factory.simplefactory.IProduct;

public interface IProductFactory {
    public IProduct createProduct(int productNo);
}
