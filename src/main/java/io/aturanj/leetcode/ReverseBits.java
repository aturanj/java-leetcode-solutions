package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/reverse-bits/
 */
public class ReverseBits {

    // you need treat n as an unsigned value
    public int reverseBits(int n) {

        System.out.println("input: " + n);

        var bits = Integer.toBinaryString(n);

        bits = String.format("%32s", bits).replaceAll(" ", "0");

        System.out.println("input binary: " + bits);

        var bitArray = bits.toCharArray();

        for (int i = 0, j = 31; i < 16; i++, j--) {
            var temp = bitArray[i];
            bitArray[i] = bitArray[j];
            bitArray[j] = temp;
        }

        System.out.println("output binary: " + new String(bitArray));

        return Integer.parseUnsignedInt(new String(bitArray), 2);
    }

    public static void main(String[] args) {
        ReverseBits reverseBits = new ReverseBits();
        var output = reverseBits.reverseBits(43261596);
        System.out.println("output: " + output);
    }
}
