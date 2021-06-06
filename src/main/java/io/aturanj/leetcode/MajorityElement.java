package io.aturanj.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/majority-element/
 */
public class MajorityElement {

    public int majorityElement(int[] nums) {

        Map<Integer, Integer> map = new HashMap<>();

        for (var item : nums) {
            if (map.get(item) != null) {
                map.put(item, map.get(item) + 1);
            } else {
                map.put(item, 1);
            }
        }

        return map
                .entrySet()
                .stream()
                .max((entry1, entry2) -> entry1.getValue() > entry2.getValue() ? 1 : -1)
                .get()
                .getKey();
    }

    public static void main(String[] args) {
        MajorityElement majorityElement = new MajorityElement();
        var result = majorityElement.majorityElement(new int[]{2, 2, 1, 1, 1, 2, 2});
        System.out.println("result = " + result);
    }
}
