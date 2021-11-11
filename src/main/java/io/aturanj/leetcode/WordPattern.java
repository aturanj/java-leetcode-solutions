package io.aturanj.leetcode;

import java.util.HashMap;
import org.junit.jupiter.api.Assertions;

/**
 * https://leetcode.com/problems/word-pattern/
 */
public class WordPattern {

    public boolean wordPattern(String pattern, String s) {

        var map = new HashMap<String, Character>();
        var array = s.split(" ");

        if (array.length != pattern.length()) {
            return false;
        }

        for (var i = 0; i < array.length; i++) {

            if (!map.containsKey(array[i])) {

                var p = pattern.charAt(i);

                if (map.values().stream().anyMatch(x -> Character.compare(x, p) == 0)) {
                    return false;
                }

                map.put(array[i], pattern.charAt(i));

            } else if (Character.compare(map.get(array[i]), pattern.charAt(i)) != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        var wordPattern = new WordPattern();
        var result = wordPattern.wordPattern("abba", "dog cat cat dog");
        System.out.println("result = " + result);
        Assertions.assertTrue(result);
    }
}
