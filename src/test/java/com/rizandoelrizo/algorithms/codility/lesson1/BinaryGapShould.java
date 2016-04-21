package com.rizandoelrizo.algorithms.codility.lesson1;


import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class BinaryGapShould {

    private final BinaryGap sut = new BinaryGap();

    @Test
    public void return_zero() {
        assertTrue(sut.calculateBinaryGapFor(0) == 0);
    }

}
