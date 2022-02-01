package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
 */
public class MinimumDifferenceBetweenHighestAndLowestOfKScores {

    public int minimumDifference(int[] nums, int k) {

        if (nums.length == 1) {
            return 0;
        }

        Arrays.sort(nums);

        var minDiff = Integer.MAX_VALUE;

        for (var i = 0; i <= nums.length - k; i++) {

            var diff = nums[i + k - 1] - nums[i];

            if (diff < minDiff) {
                minDiff = diff;
            }
        }

        return minDiff;
    }

    public static void main(String[] args) {
        var kScores = new MinimumDifferenceBetweenHighestAndLowestOfKScores();
        var result = kScores.minimumDifference(new int[]{9, 4, 1, 7}, 2);
        System.out.println("result = " + result);
        assertEquals(2, result);
    }
}
