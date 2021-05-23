package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/power-of-three/
 */
public class PowerOfThree {

    public boolean isPowerOfThree(int n) {

        if (n <= 0) {
            return false;
        }

        while (n % 3 == 0) {
            n /= 3;
        }

        return n == 1;
    }

    public static void main(String[] args) {
        PowerOfThree powerOfThree = new PowerOfThree();
        var result = powerOfThree.isPowerOfThree(27);

        System.out.println("result = " + result);
    }
}
