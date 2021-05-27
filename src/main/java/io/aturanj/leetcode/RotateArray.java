package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/rotate-array/
 */
public class RotateArray {

    public void rotate(int[] nums, int k) {

        System.out.println("before = " + Arrays.toString(nums));

        int[] a = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            a[(i + k) % nums.length] = nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            nums[i] = a[i];
        }

        System.out.println("after = " + Arrays.toString(nums));
    }

    public static void main(String[] args) {

        RotateArray rotateArray = new RotateArray();
        rotateArray.rotate(new int[]{1, 2, 3, 4, 5, 6, 7}, 3);
    }
}
