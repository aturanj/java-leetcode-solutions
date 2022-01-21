package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/minimum-increment-to-make-array-unique/
 */
public class MinimumIncrementToMakeArrayUnique {

    public int minIncrementForUnique(int[] nums) {

        var counter = 0;

        Arrays.sort(nums);

        var prev = nums[0];

        for (var i = 1; i < nums.length; i++) {

            if (nums[i] <= prev) {
                counter += prev - nums[i] + 1;
                nums[i] = prev + 1;
            }
            prev = nums[i];
        }

        return counter;
    }

    public static void main(String[] args) {

        var makeArrayUnique = new MinimumIncrementToMakeArrayUnique();
        var result = makeArrayUnique.minIncrementForUnique(
                new int[]{3, 2, 1, 2, 1, 7}
        );
        System.out.println("result = " + result);
        assertEquals(6, result);
    }
}
