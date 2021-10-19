package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/power-of-two/submissions/
 */
public class PowerOfTwo {

    public boolean isPowerOfTwo(int n) {
        switch (n) {
            case 0:
                return false;
            case 1:
                return true;
            default:
                if (n % 2 != 0) {
                    return false;
                }
        }
        return isPowerOfTwo(n / 2);
    }

    public static void main(String[] args) {
        var powerOfTwo = new PowerOfTwo();
        var result = powerOfTwo.isPowerOfTwo(32);
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
