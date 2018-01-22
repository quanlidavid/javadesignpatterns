package com.quanlidavid.reflect;

import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectServiceImplTest {

    public ReflectServiceImpl getInstance() {
        ReflectServiceImpl object = null;
        try {
            object = (ReflectServiceImpl) Class.forName("com.quanlidavid.reflect.ReflectServiceImpl").newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    public Object reflectMethod(){
        Object returnObj=null;
        ReflectServiceImpl reflectService = getInstance();

        try {
            Method method = ReflectServiceImpl.class.getMethod("sayHello", String.class);
            returnObj = method.invoke(reflectService,"Quan");
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        return returnObj;
    }

    @Test
    public void getInstanceTest() {
        ReflectServiceImpl reflectService = getInstance();
        reflectService.sayHello("David");
    }

    @Test
    public void reflectMethodTest(){
        Object object = reflectMethod();

    }
}
