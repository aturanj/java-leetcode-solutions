package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/decrypt-string-from-alphabet-to-integer-mapping/
 */
public class DecryptStringFromAlphabetToIntegerMapping {

    public String freqAlphabets(String s) {

        var charSetOne = "abcdefghi";
        var charSetTwo = "jklmnopqrstuvwxyz";

        var current = "";
        var prev = "";
        var check = false;
        var list = new ArrayList<String>();

        for (var i = s.length() - 1; i >= 0; i += 0) {

            if (s.charAt(i) == '#') {
                check = false;
                prev = s.substring(i - 2, i);
                i -= 3;
            } else {
                check = true;
                var j = i;

                while (true) {
                    if (j >= 0 && s.charAt(j) != '#') {
                        j--;
                    } else {
                        break;
                    }
                }
                current = s.substring(j + 1, i + 1);
                i = j;
            }

            if (check) {
                var sb = new StringBuilder();
                for (var ch : current.toCharArray()) {
                    sb.append(charSetOne.charAt(Integer.valueOf("" + ch) - 1));
                }
                list.add(sb.toString());
            } else {
                list.add("" + charSetTwo.charAt(Integer.valueOf(prev) - 10));
            }
        }

        Collections.reverse(list);

        return list.stream().collect(Collectors.joining());
    }

    public static void main(String[] args) {
        var decryptString = new DecryptStringFromAlphabetToIntegerMapping();
        var result = decryptString.freqAlphabets("824#15#826#");
        System.out.println("result = " + result);
        assertEquals("hxohz", result);
    }
}
