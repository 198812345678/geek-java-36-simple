package com.will.simple.geek.java36.ch2;

import org.junit.Test;

import static org.junit.Assert.*;

public class TryWithResourceTest {

    @Test
    public void closeEx() {
    }

    @Test
    public void connectExAndCloseEx() {
        TryWithResource tryWithResource = new TryWithResource();
        tryWithResource.connectExAndCloseEx();
    }
}