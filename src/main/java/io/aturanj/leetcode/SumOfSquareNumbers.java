package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/sum-of-square-numbers/
 */
public class SumOfSquareNumbers {

    public boolean judgeSquareSum(int c) {

        int left = 0;
        int right = (int) Math.sqrt(c);

        while (left <= right) {

            int sum = left * left + right * right;

            if (sum < c) {
                left++;
            } else if (sum > c) {
                right--;
            } else {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {

        SumOfSquareNumbers sumOfSquareNumbers = new SumOfSquareNumbers();
        var result = sumOfSquareNumbers.judgeSquareSum(20);

        System.out.println("result = " + result);
    }
}
