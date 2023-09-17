package com.csaba79coder.task;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RightPyramidTest {

    private RightPyramid rightpyramid;

    @BeforeEach
    void setUp() {
        rightpyramid = new RightPyramid();
    }

    @Test
    void testCreatePyramid() {
        String expectedOutput =
                "    *\n" +
                        "   **\n" +
                        "  ***\n" +
                        " ****\n" +
                        "*****\n";

        String result = rightpyramid.createPyramidFull(5);

        assertEquals(expectedOutput, result);

        String expectedOutput2 =
                "  *\n" +
                        " **\n" +
                        "***\n";

        String result2 = rightpyramid.createPyramidFull(3);

        assertEquals(expectedOutput2, result2);
    }
}