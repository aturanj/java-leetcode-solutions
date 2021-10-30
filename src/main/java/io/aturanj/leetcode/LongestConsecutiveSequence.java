package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/longest-consecutive-sequence/
 */
public class LongestConsecutiveSequence {

    public int longestConsecutive(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        Arrays.sort(nums);

        var counter = 1;
        var max = 1;

        for (var i = 0; i < nums.length - 1; i++) {
            if (nums[i] + 1 == nums[i + 1]) {
                counter++;
                if (counter > max) {
                    max = counter;
                }
            } else if (nums[i] == nums[i + 1]) {
                continue;
            } else {
                counter = 1;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        var longestConsecutiveSequence = new LongestConsecutiveSequence();
        var result = longestConsecutiveSequence.longestConsecutive(new int[]{9, 1, 4, 7, 3, -1, 0, 5, 8, -1, 6});
        System.out.println("result = " + result);
        assertEquals(7, result);
    }
}
