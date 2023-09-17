package com.csaba79coder.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LeftPyramidTest {

    private LeftPyramid leftpyramid;

    @BeforeEach
    void setUp() {
        leftpyramid = new LeftPyramid();
    }

    @Test
    void testCreatePyramid() {
        String expectedOutput =
                "*\n" +
                        "**\n" +
                        "***\n" +
                        "****\n" +
                        "*****\n";

        String result = leftpyramid.createPyramidFull(5);

        assertEquals(expectedOutput, result);

        String expectedOutput2 =
                "*\n" +
                        "**\n" +
                        "***\n";

        String result2 = leftpyramid.createPyramidFull(3);

        assertEquals(expectedOutput2, result2);
    }
}