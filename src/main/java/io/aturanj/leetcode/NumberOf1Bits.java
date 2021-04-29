package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/number-of-1-bits/
 */
public class NumberOf1Bits {

    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {

        var text = Integer.toBinaryString(n);

        text = String.format("%32s", text);
        text = text.replaceAll(" ", "0");

        int counter = 0;

        for (int i = 0; i < text.length(); i++) {

            if (Character.compare(text.charAt(i), '1') == 0) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        NumberOf1Bits numberOf1Bits = new NumberOf1Bits();
        var result = numberOf1Bits.hammingWeight(00000000000000000000000000001011);

        System.out.println("result = " + result);
    }
}
