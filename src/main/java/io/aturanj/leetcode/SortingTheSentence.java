package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.Map;
import java.util.TreeMap;

/**
 * https://leetcode.com/problems/sorting-the-sentence/
 */
public class SortingTheSentence {

    public String sortSentence(String s) {

        Map<String, String> map = new TreeMap<>();

        String[] words = s.split(" ");

        for (var item : words) {
            var last = "" + item.charAt(item.length() - 1);
            var word = item.substring(0, item.length() - 1);

            map.put(last, word);
        }

        var sentence = Arrays.toString(map.values().toArray())
                .replace(",", "")
                .replace("[", "")
                .replace("]", "");

        return sentence;
    }

    public static void main(String[] args) {
        SortingTheSentence sortingTheSentence = new SortingTheSentence();
        var result = sortingTheSentence.sortSentence("is2 sentence4 This1 a3");

        System.out.println("result = " + result);
    }
}
