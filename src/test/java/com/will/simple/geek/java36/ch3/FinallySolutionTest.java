package com.will.simple.geek.java36.ch3;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class FinallySolutionTest {

    @Test
    public void finallyNotExc() {
        FinallySolution solution = new FinallySolution();
        solution.finallyNotExc();
    }

    @Test
    public void finallyExc() {
        FinallySolution solution = new FinallySolution();
        solution.finallyExc();
    }

}