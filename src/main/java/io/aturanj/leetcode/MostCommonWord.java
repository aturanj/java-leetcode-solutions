package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import org.junit.jupiter.api.Assertions;

/**
 * https://leetcode.com/problems/most-common-word/
 */
public class MostCommonWord {

    public String mostCommonWord(String paragraph, String[] banned) {

        var paragraphArray = paragraph
                .replaceAll("[^A-Za-z0-9]", " ")
                .split(" ");

        var map = new HashMap<String, Integer>();
        var list = Arrays.asList(banned);

        for (var item : paragraphArray) {

            item = item.trim().toLowerCase();

            if (!list.contains(item) && !item.isEmpty()) {
                map.put(item, map.getOrDefault(item, 0) + 1);
            }
        }

        return map.entrySet()
                .stream()
                .max((e1, e2) -> e1.getValue() > e2.getValue() ? 1 : -1)
                .get()
                .getKey();
    }

    public static void main(String[] args) {
        var mostCommonWord = new MostCommonWord();
        var result = mostCommonWord.mostCommonWord("Bob hit a ball, "
                + "the hit BALL flew far after it was hit.",
                new String[]{"hit"});
        System.out.println("result = " + result);
        Assertions.assertEquals("ball", result);
    }
}
