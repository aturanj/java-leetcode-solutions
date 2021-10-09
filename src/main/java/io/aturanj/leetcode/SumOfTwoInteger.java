package io.aturanj.leetcode;

import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/sum-of-two-integers/
 */
public class SumOfTwoInteger {

    public int getSum(int a, int b) {
        return new BigInteger(a + "").add(new BigInteger(b + "")).intValue();
    }

    public static void main(String[] args) {
        var sumOfTwoInteger = new SumOfTwoInteger();
        var result = sumOfTwoInteger.getSum(1, 2);
        System.out.println("result = " + result);
        assertEquals(result, 3);
    }
}
