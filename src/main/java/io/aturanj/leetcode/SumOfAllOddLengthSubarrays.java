package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 */
public class SumOfAllOddLengthSubarrays {

    public int sumOddLengthSubarrays(int[] arr) {

        int sum = 0;

        for (int i = 1; i <= arr.length; i += 2) {

            int pointer = 0;

            while (pointer + i <= arr.length) {

                for (int j = 0; j < i; j++) {
                    sum += arr[pointer + j];
                }

                pointer++;
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        SumOfAllOddLengthSubarrays allOddLengthSubarrays
                = new SumOfAllOddLengthSubarrays();
        var result = allOddLengthSubarrays.sumOddLengthSubarrays(new int[]{1, 4, 2, 5, 3});

        System.out.println("result = " + result);
    }
}
