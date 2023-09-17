package com.csaba79coder.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReversePyramidTest {

    private ReversePyramid reversepyramid;

    @BeforeEach
    void setUp() {
        reversepyramid = new ReversePyramid();
    }

    @Test
    void testCreatePyramid() {
        String expectedOutput =
                "*********\n" +
                        " *******\n" +
                        "  *****\n" +
                        "   ***\n" +
                        "    *\n";

        String result = reversepyramid.createPyramidFull(5);

        assertEquals(expectedOutput, result);

        String expectedOutput2 =
                "*****\n" +
                        " ***\n" +
                        "  *\n";

        String result2 = reversepyramid.createPyramidFull(3);

        assertEquals(expectedOutput2, result2);
    }
}