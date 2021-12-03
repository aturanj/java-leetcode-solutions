package io.aturanj.leetcode;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicInteger;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/count-largest-group/
 */
public class CountLargestGroup {

    public int countLargestGroup(int n) {

        var map = new HashMap<Integer, Integer>();
        var max = 0;

        for (var i = 1; i <= n; i++) {
            var sum = 0;
            for (var item : ("" + i).toCharArray()) {
                sum += Integer.valueOf("" + item);
            }

            var count = map.getOrDefault(sum, 0) + 1;
            if (count > max) {
                max = count;
            }

            map.put(sum, count);
        }

        var atomicMax = new AtomicInteger(max);

        return (int) map.values().stream().filter(x -> x == atomicMax.get()).count();
    }

    public static void main(String[] args) {
        var countLargestGroup = new CountLargestGroup();
        var result = countLargestGroup.countLargestGroup(13);
        System.out.println("result = " + result);
        assertEquals(4, result);
    }
}
