package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays-ii/
 */
public class IntersectionOfTwoArraysII {

    public int[] intersect(int[] nums1, int[] nums2) {

        List<Integer> list1 = Arrays.stream(nums1).boxed().collect(Collectors.toList());
        List<Integer> list2 = Arrays.stream(nums2).boxed().collect(Collectors.toList());

        List<Integer> resultList = new ArrayList();

        for (Integer item : list1) {

            if (!list2.isEmpty() && list2.contains(item)) {

                list2.remove(item);

                resultList.add(item);

            } else {
                break;
            }
        }

        return resultList.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {

        IntersectionOfTwoArraysII intersectionOfTwoArraysII = new IntersectionOfTwoArraysII();

        var result = intersectionOfTwoArraysII.intersect(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});

        System.out.println("result = " + Arrays.toString(result));
    }
}
