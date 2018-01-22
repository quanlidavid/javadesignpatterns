package com.quanlidavid.intercept;

import com.quanlidavid.proxy.jdkproxy.HelloWorld;
import com.quanlidavid.proxy.jdkproxy.HelloWorldImpl;
import org.testng.annotations.Test;

public class MyInterceptorTest {
    @Test
    public void myInterceptorTest(){
        HelloWorld proxy = (HelloWorld) InterceptorJdkProxy.bind(new HelloWorldImpl(),"com.quanlidavid.intercept.MyInterceptor");
        proxy.sayHelloWorld();
    }
}
