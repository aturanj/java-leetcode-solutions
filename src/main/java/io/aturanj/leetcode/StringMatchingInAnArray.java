package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/string-matching-in-an-array/
 */
public class StringMatchingInAnArray {

    public List<String> stringMatching(String[] words) {

        var list = new ArrayList<String>();

        for (var word : words) {
            for (var word2 : words) {
                if (!word.equals(word2)
                        && word.contains(word2)
                        && !list.contains(word2)) {
                    list.add(word2);
                }
            }
        }

        return list;
    }

    public static void main(String[] args) {
        var stringMatchingInAnArray = new StringMatchingInAnArray();
        var result = stringMatchingInAnArray
                .stringMatching(new String[]{"mass", "as", "hero", "superhero"});
        System.out.println("result = " + result);
        assertEquals(Arrays.asList("as", "hero"), result);
    }
}
