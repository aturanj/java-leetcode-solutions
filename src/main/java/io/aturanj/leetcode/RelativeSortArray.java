package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://leetcode.com/problems/relative-sort-array/
 */
public class RelativeSortArray {

    public int[] relativeSortArray(int[] arr1, int[] arr2) {

        var listFront = new ArrayList<Integer>();

        for (var item : arr2) {
            if (!listFront.contains(item) && Arrays.stream(arr2).anyMatch(x -> x == item)) {
                for (var i = 0; i < Arrays.stream(arr1).filter(x -> x == item).count(); i++) {
                    listFront.add(item);
                }
            }
        }

        var listEnd = Arrays.stream(arr1).boxed().collect(Collectors.toList());
        listEnd.removeAll(listFront);
        Collections.sort(listEnd);

        listFront.addAll(listEnd);

        return listFront.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        var relativeSortArray = new RelativeSortArray();
        var result = relativeSortArray.relativeSortArray(
                new int[]{2, 3, 1, 3, 2, 4, 6, 7, 9, 2, 19},
                new int[]{2, 1, 4, 3, 9, 6});
        System.out.println("result = " + Arrays.toString(result));
        assertArrayEquals(new int[]{2, 2, 2, 1, 4, 3, 3, 9, 6, 7, 19}, result);
    }
}
