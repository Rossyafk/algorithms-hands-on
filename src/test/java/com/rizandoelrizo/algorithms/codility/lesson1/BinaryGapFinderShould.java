package com.rizandoelrizo.algorithms.codility.lesson1;


import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

public class BinaryGapFinderShould {

    private final BinaryGapFinder sut = new BinaryGapFinder();

    @Test
    public void find_the_only_sequence_of_zeroes_in_the_middle() {
        assertThat(biggestBinaryGapFor(9), is(2));
    }

    @Test
    public void find_the_longest_sequence_of_zeroes_in_the_middle() {
        assertThat(biggestBinaryGapFor(529), is(4));
    }

    @Test
    public void find_the_longest_sequence_of_zeroes_at_the_end() {
        assertThat(biggestBinaryGapFor(20), is(1));
    }

    @Test
    public void cannot_find_a_sequence_when_there_is_none() {
        assertThat(biggestBinaryGapFor(15), is(0));
    }

    private int biggestBinaryGapFor(int integer) {
        return sut.findBiggestFor(integer);
    }

}
