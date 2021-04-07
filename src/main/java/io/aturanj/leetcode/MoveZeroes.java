package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/move-zeroes/
 */
public class MoveZeroes {

    private int counter = 0;

    public void moveZeroes(int[] nums) {

        System.out.println("nums before= " + Arrays.toString(nums));

        check(nums);

        System.out.println("nums after= " + Arrays.toString(nums));
    }

    private void check(int[] nums) {

        for (int i = 0; i < nums.length - counter; i++) {

            if (nums[i] == 0) {

                move(i, nums);

                counter++;

                check(nums);

                break;
            }
        }
    }

    private void move(int index, int[] nums) {

        for (int i = index; i < nums.length - 1; i++) {
            nums[i] = nums[i + 1];
        }

        nums[nums.length - 1] = 0;
    }

    public static void main(String[] args) {
        MoveZeroes moveZeroes = new MoveZeroes();
        moveZeroes.moveZeroes(new int[]{0, 1, 0, 3, 12});
    }
}
