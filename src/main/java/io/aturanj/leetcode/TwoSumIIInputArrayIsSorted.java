package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/
 */
public class TwoSumIIInputArrayIsSorted {

    public int[] twoSum(int[] numbers, int target) {

        var left = 0;
        var right = numbers.length - 1;

        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            } else if (numbers[left] + numbers[right] > target) {
                right--;
            } else {
                left++;
            }
        }

        return new int[0];
    }

    public static void main(String[] args) {
        var twoSumII = new TwoSumIIInputArrayIsSorted();
        var result = twoSumII.twoSum(new int[]{2, 3, 4}, 6);
        System.out.println("result = " + Arrays.toString(result));
    }
}
