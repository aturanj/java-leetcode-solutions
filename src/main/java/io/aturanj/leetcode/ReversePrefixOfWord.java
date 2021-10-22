package io.aturanj.leetcode;

import org.junit.jupiter.api.Assertions;

/**
 * https://leetcode.com/problems/reverse-prefix-of-word/
 */
public class ReversePrefixOfWord {

    public String reversePrefix(String word, char ch) {

        if (!word.contains(ch + "")) {
            return word;
        }

        var index = word.indexOf(ch + "");
        var firstPart = word.substring(0, index + 1);
        var lastPart = word.substring(index + 1);

        var sb = new StringBuilder(firstPart);
        sb.reverse();
        sb.append(lastPart);

        return sb.toString();
    }

    public static void main(String[] args) {
        var reversePrefixOfWord = new ReversePrefixOfWord();
        var result = reversePrefixOfWord.reversePrefix("abcdefd", 'd');
        System.out.println("result = " + result);
        Assertions.assertEquals("dcbaefd", result);
    }
}
