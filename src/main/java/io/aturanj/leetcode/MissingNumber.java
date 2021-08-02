package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/missing-number/
 */
public class MissingNumber {

    public int missingNumber(int[] nums) {

        Arrays.sort(nums);

        for (var i = 0; i < nums.length; i++) {
            if (i != nums[i]) {
                return i;
            }
        }

        return nums.length;
    }

    public static void main(String[] args) {
        var missingNumber = new MissingNumber();
        var result = missingNumber
                .missingNumber(new int[]{9, 6, 4, 2, 3, 5, 7, 0, 1});
        System.out.println("result = " + result);
    }
}
