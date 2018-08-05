package com.will.simple.geek.java36.common;

public class MockConnection implements AutoCloseable{

    public boolean connect() throws Exception {
        return true;
    }

    public boolean connectException() throws Exception {
        throw new Exception("connect exception!");
    }

    @Override
    public void close() throws Exception {
        throw new Exception("close exception!");
    }
}
