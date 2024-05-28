package com.github.ankurpapneja4.datastructures.arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ArrayUtilsTest {

    @Test
    public void middleTest() {
        // Given
        int[] myArray = new int[]{ 1, 2, 3, 4, 5};

        int[] result = ArrayUtils.middle( myArray );

        Assertions.assertArrayEquals( new int[]{2,3,4}, result);
    }


    @Test
    void sumDiagonalElementsTest() {

        int[][] myArray2D = {{1,2,3},{4,5,6},{7,8,9}};
        int sum = ArrayUtils.sumDiagonalElements( myArray2D );

        Assertions.assertEquals( 15, sum);
    }

    @Test
    void findTopTwoScoresTest() {

        int[] myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0};
        int[] result = ArrayUtils.findTopTwoScores( myArray );

        Assertions.assertArrayEquals( new int[]{90, 87}, result);
    }

    @Test
    void findMissingNumberInArray() {

        int[] myArray = {1,5,2,3,6};
        int missingNumber = ArrayUtils.findMissingNumberInArray( myArray );

        assertEquals( 4, missingNumber );
    }

    @Test
    void removeDuplicates() {

        int[] result = ArrayUtils.removeDuplicates(new int[]{1, 1, 2, 2, 3, 4, 5});

        Assertions.assertArrayEquals( new int[]{1, 2, 3, 4, 5}, result);

    }

    @Test
    void removeDuplicateInSortedArrayTest() {

        int[] myArray = {1,1,3,3,5,5,8,8,9};
        int newLength  = ArrayUtils.removeDuplicateInSortedArray( myArray );

        System.out.println( Arrays.toString( myArray) );
        Assertions.assertArrayEquals(
                new int[]{ 1,3,5,8,9},
                Arrays.copyOf( myArray, newLength));
    }
}