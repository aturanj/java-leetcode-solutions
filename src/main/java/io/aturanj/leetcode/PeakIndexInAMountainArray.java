package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/peak-index-in-a-mountain-array/
 */
public class PeakIndexInAMountainArray {

    public int peakIndexInMountainArray(int[] arr) {
        for (var i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return i - 1;
            }
        }

        return arr.length - 1;
    }

    public static void main(String[] args) {
        var peakIndex = new PeakIndexInAMountainArray();
        var result = peakIndex.peakIndexInMountainArray(
                new int[]{24, 69, 100, 99, 79, 78, 67, 36, 26, 19}
        );
        System.out.println("result = " + result);
    }
}
