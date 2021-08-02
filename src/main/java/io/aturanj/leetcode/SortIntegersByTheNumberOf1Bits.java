package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;

/**
 * https://leetcode.com/problems/sort-integers-by-the-number-of-1-bits/
 */
public class SortIntegersByTheNumberOf1Bits {

    public int[] sortByBits(int[] arr) {

        var map = new HashMap<Integer, ArrayList>();

        for (var item : arr) {

            var binary = Integer.toBinaryString(item).toCharArray();
            System.out.println(binary);

            var counter = 0;

            for (var element : binary) {
                if (element == '1') {
                    counter++;
                }
            }

            if (map.get(counter) == null) {
                var list = new ArrayList<Integer>();
                list.add(item);
                map.put(counter, list);
            } else {
                var list = map.get(counter);
                list.add(item);
                map.put(counter, list);
            }
        }

        var resultArray = new int[arr.length];
        var counter = 0;

        for (ArrayList<Integer> list : map.values()) {
            Collections.sort(list);
            for (var item : list) {
                resultArray[counter] = item;
                counter++;
            }
        }

        return resultArray;
    }

    public static void main(String[] args) {
        var sort = new SortIntegersByTheNumberOf1Bits();
        var result = sort.sortByBits(new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8});
        System.out.println("result = " + Arrays.toString(result));
    }
}
