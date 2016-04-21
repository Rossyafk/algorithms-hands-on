package com.rizandoelrizo.algorithms.codility.lesson1;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinaryGapShould {

    private final BinaryGap sut = new BinaryGap();

    @Test
    public void pass_with_the_min_value() {
        assertTrue(sut.calculateBiggestBinaryGapFor(1) == 0);
    }

    @Test
    public void pass_with_the_max_value() {
        assertTrue(sut.calculateBiggestBinaryGapFor(2_147_483_647) == 0);
    }

    @Test
    public void pass_with_the_given_example_v1() {
        assertTrue(sut.calculateBiggestBinaryGapFor(9) == 2);
    }

    @Test
    public void pass_with_the_given_example_v2() {
        assertTrue(sut.calculateBiggestBinaryGapFor(529) == 4);
    }

    @Test
    public void pass_with_the_given_example_v3() {
        assertTrue(sut.calculateBiggestBinaryGapFor(529) == 4);
    }

    @Test
    public void pass_with_the_given_example_v4() {
        assertTrue(sut.calculateBiggestBinaryGapFor(20) == 1);
    }

    @Test
    public void pass_with_the_given_example_v5() {
        assertTrue(sut.calculateBiggestBinaryGapFor(15) == 0);
    }

}
