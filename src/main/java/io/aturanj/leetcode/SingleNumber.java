package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/single-number/
 */
public class SingleNumber {

    public int singleNumber(int[] nums) {

        if (nums.length == 1) {
            return nums[0];
        }

        for (int item : nums) {

            int counter = 0;

            for (int item2 : nums) {
                if (item2 == item) {
                    counter++;
                }
            }

            if (counter == 1) {
                return item;
            }
        }

        return 0;
    }

    public static void main(String[] args) {

        SingleNumber singleNumber = new SingleNumber();
        var result = singleNumber.singleNumber(new int[]{4, 1, 2, 1, 2});

        System.out.println("result = " + result);
    }
}
