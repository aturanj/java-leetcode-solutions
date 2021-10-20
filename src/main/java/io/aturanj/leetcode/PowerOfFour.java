package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/power-of-four/
 */
public class PowerOfFour {

    public boolean isPowerOfFour(int n) {
        switch (n) {
            case 0:
                return false;
            case 1:
                return true;
            default:
                if (n % 4 != 0) {
                    return false;
                }
        }
        return isPowerOfFour(n / 4);
    }

    public static void main(String[] args) {
        var powerOfFour = new PowerOfFour();
        var result = powerOfFour.isPowerOfFour(64);
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
