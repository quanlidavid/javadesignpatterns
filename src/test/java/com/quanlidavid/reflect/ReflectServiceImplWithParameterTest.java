package com.quanlidavid.reflect;

import org.testng.annotations.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectServiceImplWithParameterTest {
    public ReflectServiceImplWithParameter getInstance() {
        ReflectServiceImplWithParameter object = null;
        try {
            object = (ReflectServiceImplWithParameter) Class.forName("com.quanlidavid.reflect.ReflectServiceImplWithParameter")
                    .getConstructor(String.class).newInstance("Jack");
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return object;
    }

    public void reflectMethod(){
        ReflectServiceImplWithParameter object = getInstance();
        try {
            Method method = object.getClass().getMethod("sayHello");
            method.invoke(object);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
    @Test
    public void getInstanceTest(){
        ReflectServiceImplWithParameter object = getInstance();
        object.sayHello();
    }
    @Test
    public void refelctMethodTest(){
        reflectMethod();
    }
}
