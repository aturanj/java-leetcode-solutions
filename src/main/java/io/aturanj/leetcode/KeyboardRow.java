package io.aturanj.leetcode;

import java.util.*;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://leetcode.com/problems/keyboard-row/
 */
public class KeyboardRow {

    public String[] findWords(String[] words) {

        var firstRow = "qwertyuiop";
        var secondRow = "asdfghjkl";
        var thirdRow = "zxcvbnm";
        var list = new ArrayList<String>();

        for (var word : words) {

            var first = false;
            var second = false;
            var third = false;

            for (var letter : word.toCharArray()) {

                if (firstRow.contains(("" + letter).toLowerCase()) && !second && !third) {
                    first = true;
                } else if (secondRow.contains(("" + letter).toLowerCase()) && !first && !third) {
                    second = true;
                } else if (thirdRow.contains(("" + letter).toLowerCase()) && !first && !second) {
                    third = true;
                } else {
                    first = second = third = true;
                    break;
                }
            }

            if ((first && !second && !third)
                    || (!first && second && !third)
                    || (!first && !second && third)) {
                list.add(word);
            }
        }

        return list.stream().toArray(String[]::new);
    }

    public static void main(String[] args) {
        var keyboardRow = new KeyboardRow();
        var result = keyboardRow.findWords(
                new String[]{"Hello", "Alaska", "Dad", "Peace"}
        );
        System.out.println("result = " + Arrays.toString(result));
        assertArrayEquals(new String[]{"Alaska", "Dad"}, result);
    }
}
