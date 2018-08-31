package com.will.simple.geek.java36.ch6;

import org.junit.Test;

public class JdkProxyTest {

    @Test
    public void test() {
        SimpleInterface proxy = new SimpleJdkProxy().genProxy(new SimpleClass());
        proxy.method999();
    }
}
