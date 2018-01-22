package com.quanlidavid.factory.simplefactory;

public class ProductFactory {
    public static IProduct createProduct(int productNo) throws NotSupportException {
        switch (productNo){
            case 1:return new Product1();
            case 2:return new Product2();
            case 3:return new Product3();
            default:throw new NotSupportException("不支持此编号产品生产");
        }
    }
}
