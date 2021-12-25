package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/maximum-number-of-words-found-in-sentences/
 */
public class MaximumNumberOfWordsFoundInSentences {

    public int mostWordsFound(String[] sentences) {

        var max = 0;

        for (var sentence : sentences) {
            var words = sentence.split(" ");
            if (max < words.length) {
                max = words.length;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        var wordCount = new MaximumNumberOfWordsFoundInSentences();
        var result = wordCount.mostWordsFound(new String[]{
            "alice and bob love leetcode",
            "i think so too",
            "this is great thanks very much"
        });
        System.out.println("result = " + result);
        assertEquals(6, result);
    }
}
