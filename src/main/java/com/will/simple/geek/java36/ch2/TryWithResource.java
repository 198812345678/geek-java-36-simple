package com.will.simple.geek.java36.ch2;

import com.will.simple.geek.java36.common.MockConnection;

/**
 * https://www.cnblogs.com/itZhy/p/7636615.html
 */
public class TryWithResource {

    /**
     * close的异常被抛出
     */
    public void closeEx() {

        try (MockConnection connection = new MockConnection()) {
            connection.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * close的异常会被抑制
     */
    public void connectExAndCloseEx() {
        try (MockConnection connection = new MockConnection()) {
            connection.connectException();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
