package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/rearrange-spaces-between-words/
 */
public class RearrangeSpacesBetweenWords {

    public String reorderSpaces(String text) {

        var textArray = text.split("\\s+");
        var list = Arrays.stream(textArray).filter(x -> x.length() > 0).collect(Collectors.toList());
        var numberOfSpaces = text.length() - text.replace(" ", "").length();

        if (list.size() == 1) {
            var sb = new StringBuilder();
            IntStream.range(0, numberOfSpaces).forEach(x -> sb.append(" "));
            return text.trim() + sb.toString();
        }

        var evenlyDistributedSpaces = numberOfSpaces / (list.size() - 1);
        var carry = numberOfSpaces % (list.size() - 1);
        var sb = new StringBuilder();

        IntStream.range(0, list.size()).forEach(j -> {

            sb.append(list.get(j));

            if (j == list.size() - 1) {
                IntStream.range(0, carry).forEach(i -> sb.append(" "));
            } else {
                IntStream.range(0, evenlyDistributedSpaces).forEach(i -> sb.append(" "));
            }
        });

        return sb.toString();
    }

    public static void main(String[] args) {
        var rearrangeSpacesBetweenWords = new RearrangeSpacesBetweenWords();
        var result = rearrangeSpacesBetweenWords.reorderSpaces("  this   is  a sentence ");
        System.out.println("result = " + result);
        assertEquals(result, "this   is   a   sentence");
    }
}
