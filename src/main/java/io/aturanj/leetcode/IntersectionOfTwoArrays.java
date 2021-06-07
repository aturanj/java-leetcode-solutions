package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/intersection-of-two-arrays/
 */
public class IntersectionOfTwoArrays {

    public int[] intersection(int[] nums1, int[] nums2) {

        Set<Integer> resultSet = new HashSet<>();
        List<Integer> nums1List = Arrays
                .stream(nums1)
                .boxed()
                .collect(Collectors.toList());

        for (var item : nums2) {
            if (nums1List.contains(item)) {
                resultSet.add(item);
            }
        }

        return resultSet.stream().mapToInt(x -> (int) x).toArray();
    }

    public static void main(String[] args) {
        IntersectionOfTwoArrays intersectionOfTwoArrays = new IntersectionOfTwoArrays();
        var result = intersectionOfTwoArrays
                .intersection(new int[]{4, 9, 5}, new int[]{9, 4, 9, 8, 4});
        System.out.println("result = " + Arrays.toString(result));
    }
}
