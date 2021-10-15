package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicInteger;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://leetcode.com/problems/counting-bits/
 */
public class CountingBits {

    public int[] countBits(int n) {

        var list = new ArrayList<Integer>();

        for (var i = 0; i <= n; i++) {
            var item = Integer.toBinaryString(i);
            var sum = new AtomicInteger(0);
            item.chars().forEach(x -> {
                sum.set(sum.get() + Character.getNumericValue(x));
            });
            list.add(sum.get());
        }

        return list.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        var countingBits = new CountingBits();
        var result = countingBits.countBits(5);
        System.out.println("result = " + Arrays.toString(result));
        assertArrayEquals(new int[]{0, 1, 1, 2, 1, 2}, result);
    }
}
