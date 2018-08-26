package com.will.simple.geek.java36.ch4;

import org.junit.Test;

public class ReferenceTest {

    @Test
    public void test_softRef() {
        Reference ref = new Reference();
        ref.softReference();
    }

    @Test
    public void test_weakRef() {
        Reference ref = new Reference();
        ref.weakRef();
    }

    @Test
    public void test_weakRef2() {
        Reference ref = new Reference();
        ref.weakRef2();
    }

    @Test
    public void test_weakRef3() {
        Reference ref = new Reference();
        ref.weakRef3();
    }
}
