package com.quanlidavid.proxy.cglibproxy;

import com.quanlidavid.reflect.ReflectServiceImpl;
import org.testng.annotations.Test;

public class CglibProxyTest {
    @Test
    public void cglibProxyTest(){
        CglibProxyExample cglibProxyExample = new CglibProxyExample();
        ReflectServiceImpl proxy = (ReflectServiceImpl) cglibProxyExample.getProxy(ReflectServiceImpl.class);
        proxy.sayHello("Ian");
    }
}
