package com.telusko.junit;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class ShapeTest {
    Shape shape = new Shape();

    @Test
    void testCalcQuareArea_withSide10() {
        assertEquals(144, shape.calcSquareArea(12));
    }
}
