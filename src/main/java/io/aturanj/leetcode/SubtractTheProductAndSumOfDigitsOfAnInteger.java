package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 */
public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public int subtractProductAndSum(int n) {

        var productOfDigits = 1;
        var sumOfDigits = 0;
        var number = "" + n;

        for (var item : number.toCharArray()) {
            var digit = Character.getNumericValue(item);
            productOfDigits *= digit;
            sumOfDigits += digit;
        }

        return productOfDigits - sumOfDigits;
    }

    public static void main(String[] args) {
        var subtract = new SubtractTheProductAndSumOfDigitsOfAnInteger();
        var result = subtract.subtractProductAndSum(4421);
        System.out.println("result = " + result);
        assertEquals(21, result);
    }
}
