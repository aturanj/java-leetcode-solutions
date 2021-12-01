package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/two-out-of-three/
 */
public class TwoOutOfThree {

    public List<Integer> twoOutOfThree(int[] nums1, int[] nums2, int[] nums3) {

        var listOne = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        var listTwo = Arrays.stream(nums2).boxed().collect(Collectors.toList());
        var listThree = Arrays.stream(nums3).boxed().collect(Collectors.toList());

        var listAll = new ArrayList<Integer>(listOne);
        listAll.addAll(listTwo);
        listAll.addAll(listThree);

        var resultSet = new HashSet<Integer>();

        listAll.stream()
                .filter(item -> ((listOne.contains(item) && listTwo.contains(item))
                || (listTwo.contains(item) && listThree.contains(item))
                || (listOne.contains(item) && listThree.contains(item))))
                .forEachOrdered(item -> {
                    resultSet.add(item);
                });

        return new ArrayList<>(resultSet);
    }

    public static void main(String[] args) {
        var twoOutOfThree = new TwoOutOfThree();
        var result = twoOutOfThree.twoOutOfThree(
                new int[]{1, 1, 3, 2},
                new int[]{2, 3},
                new int[]{3});
        System.out.println("result = " + result);
        assertTrue(result.contains(2) && result.contains(3));
    }
}
