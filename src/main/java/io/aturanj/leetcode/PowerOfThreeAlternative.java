package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * https://leetcode.com/problems/power-of-three/
 */
public class PowerOfThreeAlternative {

    public boolean isPowerOfThree(int n) {

        double current = n;

        while (current >= 3) {
            current /= 3;
        }

        return current == 1;
    }

    public static void main(String[] args) {
        var powerOfThree = new PowerOfThreeAlternative();
        var result = powerOfThree.isPowerOfThree(45);
        assertFalse(result);
    }
}
