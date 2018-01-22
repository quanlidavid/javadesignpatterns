package com.quanlidavid.observer;

import org.testng.annotations.Test;

public class ObserverTest {
    @Test
    public void observerTest(){
        ProductList observable = ProductList.getInstance();
        TaobaoObserver taobaoObserver = new TaobaoObserver();
        JingDongObserver jingDongObserver = new JingDongObserver();
        observable.addObserver(taobaoObserver);
        observable.addObserver(jingDongObserver);
        observable.addProduct("新手机XX1");
    }
}
