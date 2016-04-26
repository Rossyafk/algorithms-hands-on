package com.rizandoelrizo.algorithms.codility.lesson1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Arrays;

/**
 * Find longest sequence of zeros in binary representation of an integer.
 */
public class BinaryGapFinder {

    private static final Logger logger = LoggerFactory.getLogger(BinaryGapFinder.class);

    public int findBiggestFor(int integer) {
        int biggestGap = 0;
        logger.info("Calculating the biggest binary gap for: " + integer);

        char[] binaryArray = toBinary(integer);

        int currentGap = -1;
        for (int i = 0; i < binaryArray.length; i++){
            char currentValue = binaryArray[i];
            if (isAGapValue(currentValue)) {
                if (isAValidGap(currentGap)) {
                    currentGap++;
                }
            } else {
                biggestGap = updateMaximumGap(biggestGap, currentGap);
                currentGap = resetCurrentGap();
            }
        }

        logger.info("The biggest binary gap is: " + biggestGap);
        return biggestGap;
    }

    private char[] toBinary(int integer) {
        char[] binaryArray = Integer.toBinaryString(integer).toCharArray();
        logger.info("Binary array: " + Arrays.toString(binaryArray));
        return binaryArray;
    }

    private boolean isAGapValue(char currentValue) {
        return currentValue ==  '0';
    }

    private boolean isAValidGap(int currentGap) {
        return currentGap > -1;
    }

    private int updateMaximumGap(int biggestGap, int currentGap) {
        if (currentGap > biggestGap) {
            biggestGap = currentGap;
        }
        return biggestGap;
    }

    private int resetCurrentGap() {
        return 0;
    }

}
