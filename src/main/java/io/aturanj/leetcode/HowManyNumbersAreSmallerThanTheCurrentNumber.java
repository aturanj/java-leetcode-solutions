package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 */
public class HowManyNumbersAreSmallerThanTheCurrentNumber {

    public int[] smallerNumbersThanCurrent(int[] nums) {

        var result = new int[nums.length];

        for (var i = 0; i < nums.length; i++) {

            var counter = 0;

            for (var item : nums) {
                if (item < nums[i]) {
                    counter++;
                }
            }

            result[i] = counter;
        }

        return result;
    }

    public static void main(String[] args) {
        var howMany = new HowManyNumbersAreSmallerThanTheCurrentNumber();
        var result = howMany.smallerNumbersThanCurrent(new int[]{8, 1, 2, 2, 3});
        System.out.println("result = " + Arrays.toString(result));
    }
}
