package com.csaba79coder.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PyramidTest {

    private Pyramid pyramid;

    @BeforeEach
    void setUp() {
        pyramid = new Pyramid();
    }

    @Test
    void testCreatePyramid() {
        String expectedOutput =
                "    *\n" +
                        "   ***\n" +
                        "  *****\n" +
                        " *******\n" +
                        "*********\n";

        String result = pyramid.createPyramidFull(5);

        assertEquals(expectedOutput, result);

        String expectedOutput2 =
                "  *\n" +
                        " ***\n" +
                        "*****\n";

        String result2 = pyramid.createPyramidFull(3);

        assertEquals(expectedOutput2, result2);
    }
}