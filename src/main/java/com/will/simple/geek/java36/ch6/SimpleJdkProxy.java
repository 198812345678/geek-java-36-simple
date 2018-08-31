package com.will.simple.geek.java36.ch6;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class SimpleJdkProxy {


    public SimpleInterface genProxy(final SimpleInterface obj) {
        return (SimpleInterface)Proxy.newProxyInstance(obj.getClass().getClassLoader(), new Class[]{SimpleInterface.class}, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("this is " + obj.getClass().getSimpleName() + " proxy");
                return method.invoke(obj, args);
            }
        });
    }
}
