package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://leetcode.com/problems/occurrences-after-bigram/
 */
public class OccurrencesAfterBigram {

    public String[] findOcurrences(String text, String first, String second) {

        var textArray = text.split(" ");
        var list = new ArrayList<String>();

        for (var i = 0; i < textArray.length - 2; i++) {
            if ((textArray[i] + " " + textArray[i + 1]).equals(first + " " + second)) {
                list.add(textArray[i + 2]);
            }
        }

        return list.toArray(new String[list.size()]);
    }

    public static void main(String[] args) {
        var occurrencesAfterBigram = new OccurrencesAfterBigram();
        var result = occurrencesAfterBigram
                .findOcurrences("alice is a good girl she is a good student", "a", "good");
        System.out.println("result = " + Arrays.toString(result));
        assertArrayEquals(result, new String[]{"girl", "student"});
    }
}
