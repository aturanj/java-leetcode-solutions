package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://leetcode.com/problems/median-of-two-sorted-arrays/
 */
public class MedianOfTwoSortedArrays {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int[] tempArray = IntStream.concat(IntStream.of(nums1), IntStream.of(nums2)).toArray();

        Arrays.sort(tempArray);

        if (tempArray.length % 2 == 0) {
            return ((double) tempArray[(tempArray.length / 2) - 1] + (double) tempArray[tempArray.length / 2]) / 2d;
        } else {
            return (double) tempArray[(tempArray.length / 2)];
        }
    }

    public static void main(String[] args) {

        MedianOfTwoSortedArrays medianOfTwoSortedArrays = new MedianOfTwoSortedArrays();
        var result = medianOfTwoSortedArrays.findMedianSortedArrays(new int[]{1, 3}, new int[]{2});

        System.out.println("result = " + result);
    }
}
