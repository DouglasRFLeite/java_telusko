package com.telusko.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class CalcTest {

    Calc c = new Calc();

    @Test
    public void testDivision_with10and5() {
        assertEquals(2, c.divide(10, 5));
    }

    @Test
    public void testDivision_with3and2() {
        assertEquals(1, c.divide(3, 2));
    }
}
