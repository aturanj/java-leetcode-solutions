package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/find-lucky-integer-in-an-array/
 */
public class FindLuckyIntegerInAnArray {

    public int findLucky(int[] arr) {

        var map = new HashMap<Integer, Integer>();

        for (var item : arr) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        var list = new ArrayList<Integer>();

        map.entrySet()
                .stream()
                .filter(pair -> pair.getKey().equals(pair.getValue()))
                .forEachOrdered(pair -> {
                    list.add(pair.getKey());
                });

        if (list.size() > 0) {
            return list.stream().max(Integer::compare).get();
        }

        return -1;
    }

    public static void main(String[] args) {
        var findLuckyIntegerInAnArray = new FindLuckyIntegerInAnArray();
        var result = findLuckyIntegerInAnArray.findLucky(
                new int[]{1, 2, 2, 3, 3, 3}
        );
        System.out.println("result = " + result);
        assertEquals(3, result);
    }
}
