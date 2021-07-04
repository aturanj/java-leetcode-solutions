package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/merge-strings-alternately/
 */
public class MergeStringsAlternately {

    public String mergeAlternately(String word1, String word2) {

        var word1Array = word1.toCharArray();
        var word2Array = word2.toCharArray();
        var stringBuilder = new StringBuilder();
        var maxLength = Math.max(word1Array.length, word2Array.length);

        for (int i = 0; i < maxLength; i++) {
            if (i < word1Array.length) {
                stringBuilder.append(word1Array[i]);
            }

            if (i < word2Array.length) {
                stringBuilder.append(word2Array[i]);
            }
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        MergeStringsAlternately mergeStringsAlternately = new MergeStringsAlternately();
        var result = mergeStringsAlternately.mergeAlternately("abcd", "pq");
        System.out.println("result = " + result);
    }
}
