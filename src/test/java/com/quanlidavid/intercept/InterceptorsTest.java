package com.quanlidavid.intercept;

import com.quanlidavid.proxy.jdkproxy.HelloWorld;
import com.quanlidavid.proxy.jdkproxy.HelloWorldImpl;
import org.testng.annotations.Test;

public class InterceptorsTest {
    @Test
    public void interceptorsTest() {
        HelloWorld proxy1 = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(), "com.quanlidavid.intercept.Interceptor1");
        HelloWorld proxy2 = (HelloWorld) InterceptorJdkProxy.bind(proxy1, "com.quanlidavid.intercept.Interceptor2");
        HelloWorld proxy3 = (HelloWorld) InterceptorJdkProxy.bind(proxy2, "com.quanlidavid.intercept.Interceptor3");
        proxy3.sayHelloWorld();
    }
}
