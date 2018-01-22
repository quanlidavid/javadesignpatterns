package com.quanlidavid.reflect;

public class ReflectServiceImplWithParameter {
    private String name;

    public ReflectServiceImplWithParameter(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.err.println("Hello " + name);
    }
}
