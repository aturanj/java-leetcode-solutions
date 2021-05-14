package io.aturanj.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/shuffle-string/
 */
public class ShuffleString {

    public String restoreString(String s, int[] indices) {

        Map<Integer, Character> map = new HashMap<>();

        for (int i = 0; i < indices.length; i++) {
            map.put(indices[i], s.charAt(i));
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < indices.length; i++) {
            sb.append(map.get(i));
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        ShuffleString shuffleString = new ShuffleString();
        var result = shuffleString.restoreString("codeleet", new int[]{4, 5, 6, 7, 0, 2, 1, 3});
        System.out.println("result = " + result);
    }
}
