package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/count-prefixes-of-a-given-string/
 */
public class CountPrefixesOfGivenString {

    public int countPrefixes(String[] words, String s) {

        var list = Arrays.stream(words).collect(Collectors.toList());
        var counter = 0;

        for (var item : list) {
            if (s.startsWith(item)) {
                counter++;
            }
        }

        return counter;
    }
}
