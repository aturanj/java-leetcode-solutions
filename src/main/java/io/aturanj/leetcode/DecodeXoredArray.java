package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/decode-xored-array/
 */
public class DecodeXoredArray {

    public int[] decode(int[] encoded, int first) {

        int[] decoded = new int[encoded.length + 1];
        decoded[0] = first;

        for (int i = 0; i < encoded.length; i++) {
            //The inverse of XOR is XOR
            decoded[i + 1] = decoded[i] ^ encoded[i];
        }

        return decoded;
    }

    public static void main(String[] args) {
        DecodeXoredArray decodeXoredArray = new DecodeXoredArray();
        var result = decodeXoredArray.decode(new int[]{6, 2, 7, 3}, 4);

        System.out.println("result = " + Arrays.toString(result));
    }
}
