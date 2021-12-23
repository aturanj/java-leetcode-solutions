package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/kth-largest-element-in-an-array/
 */
public class KthLargestElementInAnArray {

    public int findKthLargest(int[] nums, int k) {
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Collections.sort(list, Collections.reverseOrder());
        return list.get(k - 1);
    }

    public static void main(String[] args) {
        var kthLargestElementInAnArray = new KthLargestElementInAnArray();
        var result = kthLargestElementInAnArray.findKthLargest(
                new int[]{3, 2, 1, 5, 6, 4},
                2
        );
        System.out.println("result = " + result);
        assertEquals(5, result);
    }
}
