package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

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
}
