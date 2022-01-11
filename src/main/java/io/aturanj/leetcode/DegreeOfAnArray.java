package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Objects;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/degree-of-an-array/
 */
public class DegreeOfAnArray {

    public int findShortestSubArray(int[] nums) {

        if (nums.length == 1) {
            return 1;
        }

        var map = new HashMap<Integer, Integer>();
        for (var item : nums) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        var listOfMaximums = map
                .entrySet()
                .stream()
                .parallel()
                .filter(x -> Objects.equals(x.getValue(), Collections.max(map.values())))
                .map(x -> x.getKey())
                .collect(Collectors.toList());

        var listOfNums = Arrays.stream(nums)
                .boxed()
                .collect(Collectors.toList());

        var list = new ArrayList<Integer>();

        listOfMaximums.forEach(item -> {
            list.add(listOfNums.lastIndexOf(item) - listOfNums.indexOf(item) + 1);
        });

        return list.stream().mapToInt(x -> x).min().orElse(1);
    }

    public static void main(String[] args) {
        var degreeOfAnArray = new DegreeOfAnArray();
        var result = degreeOfAnArray.findShortestSubArray(new int[]{1, 2, 2, 3, 1});
        System.out.println("result = " + result);
        assertEquals(2, result);
    }
}
