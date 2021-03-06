package com.quanlidavid.intercept;

import java.lang.reflect.Method;

public class MyInterceptor implements Interceptor {
    public boolean before(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("反射方法前逻辑");
        return false; //不反射被代理对象原有方法
    }

    public void arround(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("取代了被代理对象的方法");
    }

    public void after(Object proxy, Object target, Method method, Object[] args) {
        System.err.println("反射方法后逻辑");
    }
}
