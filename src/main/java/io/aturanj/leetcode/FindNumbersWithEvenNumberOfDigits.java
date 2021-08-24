package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/find-numbers-with-even-number-of-digits/
 */
public class FindNumbersWithEvenNumberOfDigits {

    public int findNumbers(int[] nums) {

        var counter = 0;

        for (var item : nums) {
            if ((item + "").length() % 2 == 0) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        var findNumbers = new FindNumbersWithEvenNumberOfDigits();
        var result = findNumbers.findNumbers(new int[]{12, 345, 2, 6, 7896});
        System.out.println("result = " + result);
    }
}
