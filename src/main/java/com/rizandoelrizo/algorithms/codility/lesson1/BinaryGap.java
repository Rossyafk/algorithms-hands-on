package com.rizandoelrizo.algorithms.codility.lesson1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Find longest sequence of zeros in binary representation of an integer.
 */
public class BinaryGap {

    private static final Logger logger = LoggerFactory.getLogger(BinaryGap.class);

    public int calculateBiggestBinaryGapFor(int integer) {
        int biggestGap = 0;
        logger.info("Calculating the biggest binary gap for: " + integer);

        char[] binaryArray = Integer.toBinaryString(integer).toCharArray();
        logger.info("Binary array: " + Arrays.toString(binaryArray));

        int currentGap = -1;

        for (int i = 0; i < binaryArray.length; i++){
            char currentValue = binaryArray[i];
            if (currentValue == '0') {
                if (currentGap > -1) {
                    currentGap++;
                }
            } else {
                if (currentGap > biggestGap) {
                    biggestGap = currentGap;
                }
                currentGap = 0;
            }
        }

        logger.info("The biggest binary gap is: " + biggestGap);
        return biggestGap;
    }

}
