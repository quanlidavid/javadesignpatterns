package com.quanlidavid.proxy.jdkproxy;

import org.testng.annotations.Test;

public class JdkProxyTest {
    @Test
    public void jdkProxyTest(){
        JdkProxyExample jdkProxyExample = new JdkProxyExample();
        //绑定关系，因为挂在接口HelloWorld下，所以声明代理对象HelloWorld proxy
        HelloWorld proxy = (HelloWorld) jdkProxyExample.bind(new HelloWorldImpl());
        //注意，此时HelloWorld对象已经是一个代理对象，它会进入代理的逻辑方法invoke里
        proxy.sayHelloWorld();
    }
}
