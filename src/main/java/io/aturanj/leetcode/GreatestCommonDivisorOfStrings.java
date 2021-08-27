package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/greatest-common-divisor-of-strings/
 */
public class GreatestCommonDivisorOfStrings {

    public String gcdOfStrings(String str1, String str2) {

        var length = gcdEuclidian(str1.length(), str2.length());

        if ((str1 + str2).equals(str2 + str1)) {
            return str1.substring(0, length);
        }

        return "";
    }

    private int gcdEuclidian(int a, int b) {
        if (b == 0) {
            return a;
        }
        System.out.println("a: " + a + " b: " + b);
        return gcdEuclidian(b, a % b);
    }

    public static void main(String[] args) {
        var findGCD = new GreatestCommonDivisorOfStrings();
        var result = findGCD.gcdOfStrings("ABCABC", "ABC");
        System.out.println("result = " + result);
    }
}
