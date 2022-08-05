package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/count-prefixes-of-a-given-string/
 */
public class CountPrefixesOfGivenString {

    public int countPrefixes(String[] words, String s) {

        var list = Arrays.stream(words).collect(Collectors.toList());
        var counter = 0;

        return list
                .stream()
                .filter(x -> s.startsWith(x))
                .map(y -> 1)
                .reduce(counter, Integer::sum);
    }

    public static void main(String[] args) {
        var count = new CountPrefixesOfGivenString();
        var result = count.countPrefixes(
                new String[]{"a", "b", "c", "ab", "bc", "abc"},
                "abc");
        System.out.println("result = " + result);
        assertEquals(3, result);
    }
}
