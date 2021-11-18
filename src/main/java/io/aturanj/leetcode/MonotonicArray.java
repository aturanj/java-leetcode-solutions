package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import org.junit.jupiter.api.Assertions;

/**
 * https://leetcode.com/problems/monotonic-array/
 */
public class MonotonicArray {

    public boolean isMonotonic(int[] nums) {

        var increasingArray = Arrays.stream(Arrays.copyOf(nums, nums.length))
                .boxed()
                .collect(Collectors.toList());

        Collections.sort(increasingArray);

        var decreasingArray = Arrays.stream(Arrays.copyOf(nums, nums.length))
                .boxed()
                .collect(Collectors.toList());

        Collections.sort(decreasingArray, Collections.reverseOrder());

        return Arrays.equals(nums,
                increasingArray
                        .stream()
                        .mapToInt(Integer::intValue).toArray())
                || Arrays.equals(nums,
                        decreasingArray
                                .stream()
                                .mapToInt(Integer::intValue).toArray());
    }

    public static void main(String[] args) {
        var monotonicArray = new MonotonicArray();
        var result = monotonicArray.isMonotonic(new int[]{6, 5, 4, 4});
        System.out.println("result = " + result);
        Assertions.assertTrue(result);
    }
}
