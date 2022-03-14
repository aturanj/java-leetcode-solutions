package io.aturanj.leetcode;

import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/continuous-subarray-sum/
 */
public class ContinuousSubarraySum {

    public boolean checkSubarraySum(int[] nums, int k) {

        if (nums.length <= 1) {
            return false;
        }

        var map = new HashMap<Integer, Integer>();
        map.put(0, -1);

        var sum = 0;

        for (var i = 0; i < nums.length; i++) {

            sum += nums[i];

            int remainder = sum % k;

            if (map.containsKey(remainder) && i - map.get(remainder) > 1) {
                return true;
            } else if (!map.containsKey(remainder)) {
                map.put(remainder, i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        var continuousSubarraySum = new ContinuousSubarraySum();
        var result = continuousSubarraySum.checkSubarraySum(
                new int[]{23, 2, 6, 4, 7}, 6);
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
