package com.github.ankurpapneja4.datastructures.arrays;

import java.util.Arrays;

public class ArrayUtils {


    /**
     * `middle` function takes an array and returns a new array that contains all but the first and last elements.
     *
     * @param array [1, 2, 3, 4]
     * @return [2, 3].
     */
    public static int[] middle(int[] array) {

        if (array.length <= 2) return new int[0];

        int[] result = new int[array.length - 2];

        for (int i = 0; i < array.length - 2; ) {
            result[i++] = array[i];
        }
        return result;
    }

    /**
     * Given 2D array calculate the sum of diagonal elements
     *
     * @param array myArray2D= {{1,2,3},{4,5,6},{7,8,9}};
     * @return sumDiagonalElements(myArray2D) # 15
     */
    public static int sumDiagonalElements(int[][] array) {

        // Empty Array
        if (array.length == 0) return 0;

        // ROWS != COLUMNS
        if (array.length != array[0].length)
            throw new IllegalArgumentException("Sum cannot be calculated. Square Matrix Required");

        // Ignoring Jagged Arrays

        int sum = 0;
        for (int i = 0; i < array.length; i++)
            sum += array[i][i];

        return sum;

    }

    /**
     * Function to get first, second best scores from the array and return it in new array.
     * <p>
     * Array may contain duplicates.
     * <p>
     * Example:
     * myArray = {84,85,86,87,85,90,85,83,23,45,84,1,2,0}
     * firstSecond(myArray) // {90, 87}
     */
    public static int[] findTopTwoScores(int[] array) {

        if (array.length <= 1)
            throw new IllegalArgumentException("Cannot find 2 best scores. At-least 2 elements required");

        int[] result = new int[]{0, 0};

        for (int i = 0; i < array.length; i++)
            if (array[i] >= result[0]) {
                result[1] = result[0];
                result[0] = array[i];
            } else if (array[i] > result[1])
                result[1] = array[i];

        return result;
    }

    /**
     * It takes an integer array containing n-1 unique elements from a range of 1 to n, with one missing number,
     * and returns the missing number.
     * <p>
     * Example
     * myArray = {1,2,3,4,6}
     * findMissingNumberInArray(myArray, 6) // 5
     */
    public static int findMissingNumberInArray(int[] arr) {

        int sumArr = 0;
        for (int i = 0; i < arr.length; i++)
            sumArr += arr[i];

        int n = arr.length + 1;
        int sumN_NaturalNumber = (n * (n + 1)) / 2;

        return sumN_NaturalNumber - sumArr;
    }

    /**
     * a function which takes integer array as a parameter and returns a new integer array with unique elements. (remove duplicates)
     * <p>
     * Example
     * removeDuplicates({1, 1, 2, 2, 3, 4, 5})
     * Output : [1, 2, 3, 4, 5]
     */
    public static int[] removeDuplicates(int[] arr) {

        int[] copyArr = new int[arr.length];

        int k = 0;
        for (int i = 0; i < arr.length; i++, k++) {
            copyArr[k] = arr[i];
            for (int j = 0; j < i; j++)
                if (copyArr[k] == arr[j]) {
                    k--;
                    break;
                }
        }

        return Arrays.copyOf(copyArr, k);
    }

    /**
     * Given a sorted array nums, remove the duplicates in-place such that each element appears only once
     * and returns the new length.
     *
     * Do not allocate extra space for another array;
     * You must do this by modifying the input array in-place with O(1) extra memory.
     *
     * Example:
     *      Input: nums = [1, 1, 2]
     *      Output: 2
     */
    public static int removeDuplicateInSortedArray(int[] nums) {

        int n = 0;
        for (int i = 0; i < nums.length; i++, n++) {
            while ( i < nums.length -1 && nums[i] == nums[ i + 1] ) ++i;
            nums[n] = nums[i];
        }

        return n;
    }
}