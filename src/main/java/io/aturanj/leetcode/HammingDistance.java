package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/hamming-distance/
 */
public class HammingDistance {

    public int hammingDistance(int x, int y) {

        var xText = Integer.toBinaryString(x);
        var yText = Integer.toBinaryString(y);

        xText = String.format("%32s", xText).replaceAll(" ", "0");
        yText = String.format("%32s", yText).replaceAll(" ", "0");

        System.out.println(xText);
        System.out.println(yText);

        int counter = 0;

        for (int i = 0; i < 32; i++) {

            if (xText.charAt(i) != yText.charAt(i)) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        HammingDistance hammingDistance = new HammingDistance();
        var result = hammingDistance.hammingDistance(1, 4);

        System.out.println("result = " + result);
    }
}
