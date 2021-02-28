package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/shuffle-the-array/
 */
public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {

        int[] arr = new int[nums.length];
        int counter = 0;

        for (int i = 0, j = nums.length / 2; i < nums.length / 2; i++, j++) {
            arr[counter] = nums[i];
            counter++;
            arr[counter] = nums[j];
            counter++;
        }

        return arr;
    }
}
