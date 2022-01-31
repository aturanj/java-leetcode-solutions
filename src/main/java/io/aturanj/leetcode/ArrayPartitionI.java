package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/array-partition-i/
 */
public class ArrayPartitionI {

    public int arrayPairSum(int[] nums) {

        Arrays.sort(nums);

        var sum = 0;

        for (var i = 0; i < nums.length; i += 2) {
            sum += nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        var arrayPartitionI = new ArrayPartitionI();
        var result = arrayPartitionI.arrayPairSum(
                new int[]{1, 4, 3, 2}
        );
        System.out.println("result = " + result);
        assertEquals(4, result);
    }
}
