package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/sum-of-digits-in-base-k/
 */
public class SumOfDigitsInBaseK {

    public int sumBase(int n, int k) {

        var j = 0;

        while (n >= k) {
            j += n % k;
            n /= k;
        }

        return j + n;
    }

    public static void main(String[] args) {
        SumOfDigitsInBaseK sumOfDigitsInBaseK = new SumOfDigitsInBaseK();
        var result = sumOfDigitsInBaseK.sumBase(34, 6);
        System.out.println("result = " + result);
    }
}
