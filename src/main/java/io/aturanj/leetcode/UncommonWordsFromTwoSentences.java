package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 */
public class UncommonWordsFromTwoSentences {

    public String[] uncommonFromSentences(String s1, String s2) {

        var map = new HashMap<String, Integer>();
        var text = s1 + " " + s2;
        var words = text.split(" ");

        for (var word : words) {
            map.put(word, map.getOrDefault(word, 0) + 1);
        }

        var list = new ArrayList<String>();

        map.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .forEachOrdered(entry -> {
                    list.add(entry.getKey());
                });

        return list.toArray(new String[0]);
    }

    public static void main(String[] args) {
        var uncommonWordsFromTwoSentences = new UncommonWordsFromTwoSentences();
        var result = uncommonWordsFromTwoSentences.uncommonFromSentences(
                "this apple is sweet",
                "this apple is sour");
        System.out.println("result = " + Arrays.toString(result));
        assertArrayEquals(new String[]{"sweet", "sour"}, result);
    }
}
