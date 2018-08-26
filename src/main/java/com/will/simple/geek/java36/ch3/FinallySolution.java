package com.will.simple.geek.java36.ch3;

public class FinallySolution {

    public void finallyNotExc() {
        try {
            //do something
            System.exit(1);
        } finally {
            System.out.println("print from finally");
        }
    }

    public void finallyExc() {
        try {
            //do something
            return;
        } finally {
            System.out.println("print from finally");
        }
    }
}
