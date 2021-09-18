package io.aturanj.leetcode;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/tuple-with-same-product/
 */
public class TupleWithSameProduct {

    public int tupleSameProduct(int[] nums) {

        var map = new HashMap<Integer, Integer>();

        for (int i = 0; i <= nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {

                var key = nums[i] * nums[j];
                var value = map.getOrDefault(key, 0) + 1;

                map.put(key, value);
            }
        }

        return map.values()
                .stream()
                .map(item -> 8 * item * (item - 1) / 2) // 8 x C(n,r)
                .mapToInt(Integer::valueOf)
                .sum();
    }

    public static void main(String[] args) {
        var tupleWithSameProduct = new TupleWithSameProduct();
        var result = tupleWithSameProduct.tupleSameProduct(new int[]{2, 3, 4, 6, 8, 12});
        System.out.println("result = " + result);
        org.junit.jupiter.api.Assertions.assertEquals(40, result);
    }
}
