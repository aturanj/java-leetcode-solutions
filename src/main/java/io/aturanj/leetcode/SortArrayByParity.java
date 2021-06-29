package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/sort-array-by-parity/
 */
public class SortArrayByParity {

    public int[] sortArrayByParity(int[] nums) {

        var result = new int[nums.length];

        int i = 0, j = nums.length - 1;

        for (var item : nums) {
            if (item % 2 == 0) { //even number
                result[i] = item;
                i++;
            } else {
                result[j] = item;
                j--;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        SortArrayByParity sortArrayByParity = new SortArrayByParity();
        var result = sortArrayByParity.sortArrayByParity(new int[]{3, 1, 2, 4});
        System.out.println("result = " + Arrays.toString(result));
    }
}
