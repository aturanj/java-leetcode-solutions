package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/concatenation-of-array/
 */
public class ConcatenationOfArray {

    public int[] getConcatenation(int[] nums) {

        int[] concatenatedArray = Arrays.copyOf(nums, 2 * nums.length);
        System.arraycopy(nums, 0, concatenatedArray, nums.length, nums.length);

        return concatenatedArray;
    }

    public static void main(String[] args) {
        var concatenationOfArray = new ConcatenationOfArray();
        var result = concatenationOfArray.getConcatenation(new int[]{1, 3, 2, 1});
        System.out.println("result = " + Arrays.toString(result));
    }
}
