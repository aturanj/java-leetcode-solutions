package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.HashSet;

/**
 * https://leetcode.com/problems/number-of-different-integers-in-a-string/
 */
public class NumberOfDifferentIntegersInString {

    public int numDifferentIntegers(String word) {

        var array = new Character[]{'1', '2', '3', '4', '5', '6', '7', '8', '9', '0'};
        var set = new HashSet<String>();
        var sb = new StringBuilder();

        for (var ch : word.toCharArray()) {
            if (Arrays.stream(array).anyMatch(x -> x == ch)) {
                sb.append(ch);
            } else {
                if (sb.length() > 0) {
                    while (sb.length() > 1 && sb.charAt(0) == '0') {
                        sb.deleteCharAt(0);
                    }
                    set.add(sb.toString());
                }
                sb.setLength(0);
            }
        }

        if (sb.length() > 0) {
            while (sb.length() > 1 && sb.charAt(0) == '0') {
                sb.deleteCharAt(0);
            }
            set.add(sb.toString());
        }

        return set.size();
    }

    public static void main(String[] args) {
        var numberOfDifferentIntegersInString = new NumberOfDifferentIntegersInString();
        var result = numberOfDifferentIntegersInString.numDifferentIntegers("a123bc34d8ef34");
        System.out.println("result = " + result);
    }
}
