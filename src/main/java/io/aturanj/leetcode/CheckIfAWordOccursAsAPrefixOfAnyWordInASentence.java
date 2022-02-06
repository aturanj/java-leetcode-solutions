package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
 */
public class CheckIfAWordOccursAsAPrefixOfAnyWordInASentence {

    public int isPrefixOfWord(String sentence, String searchWord) {

        var words = sentence.split(" ");

        for (var i = 0; i < words.length; i++) {
            if (words[i].startsWith(searchWord)) {
                return i + 1;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        var check = new CheckIfAWordOccursAsAPrefixOfAnyWordInASentence();
        var result = check.isPrefixOfWord("i love eating burger", "burg");
        System.out.println("result = " + result);
        assertEquals(4, result);
    }
}
