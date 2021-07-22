package io.aturanj.leetcode;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/longest-chunked-palindrome-decomposition/
 */
public class LongestChunkedPalindromeDecomposition {

    public int longestDecomposition(String text) {

        var length = text.length();
        var list = new ArrayList<String>();
        var sbLeft = new StringBuilder();
        var sbRight = new StringBuilder();

        var surplus = "";

        for (int i = 0, j = length - 1; i <= j; i++, j--) {

            sbLeft.append(text.charAt(i));
            sbRight.append(text.charAt(j));

            var tempSb = sbRight.reverse();

            if (sbLeft.compareTo(tempSb) == 0 && i < j) {
                list.add(sbLeft.toString());
                list.add(sbRight.toString());
                sbLeft.setLength(0);
                sbRight.setLength(0);
            }

            surplus = sbLeft.toString() + sbRight.toString();

            sbRight.reverse();
        }

        if (surplus.length() > 0) {
            list.add(surplus);
        }

        list.stream().forEach(System.out::println);

        return list.size();
    }

    public static void main(String[] args) {
        var palindromeDecomposition = new LongestChunkedPalindromeDecomposition();
        var result = palindromeDecomposition
                .longestDecomposition("ghiabcdefhelloadamhelloabcdefghi");
        System.out.println("result = " + result);
    }
}
