package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/smallest-index-with-equal-value/
 */
public class SmallestIndexWithEqualValue {

    public int smallestEqual(int[] nums) {

        for (var i = 0; i < nums.length; i++) {
            if (i % 10 == nums[i]) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        var smallestIndexWithEqualValue = new SmallestIndexWithEqualValue();
        var result = smallestIndexWithEqualValue.smallestEqual(
                new int[]{7, 8, 3, 5, 2, 6, 3, 1, 1, 4, 5, 4, 8,
                    7, 2, 0, 9, 9, 0, 5, 7, 1, 6}
        );
        System.out.println("result = " + result);
        assertEquals(21, result);
    }
}
