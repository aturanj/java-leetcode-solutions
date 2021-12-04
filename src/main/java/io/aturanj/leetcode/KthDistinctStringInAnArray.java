package io.aturanj.leetcode;

import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/kth-distinct-string-in-an-array/
 */
public class KthDistinctStringInAnArray {

    public String kthDistinct(String[] arr, int k) {

        var map = new LinkedHashMap<String, Integer>();

        for (var item : arr) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        var distinctCount = map.entrySet().stream().filter(x -> x.getValue() == 1).count();
        if (distinctCount == 0) {
            return "";
        }

        var counter = new AtomicInteger();
        var kthDistinctString = new AtomicReference<String>("");

        map.entrySet()
                .stream()
                .filter(e -> e.getValue() == 1)
                .forEach(e -> {
                    if (counter.incrementAndGet() == k) {
                        kthDistinctString.set(e.getKey());
                    }
                });

        return kthDistinctString.get();
    }

    public static void main(String[] args) {
        var kthDistinctStringInAnArray = new KthDistinctStringInAnArray();
        var result = kthDistinctStringInAnArray.kthDistinct(
                new String[]{"d", "b", "c", "b", "c", "a"},
                2
        );
        System.out.println("result = " + result);
        assertEquals("a", result);
    }
}
