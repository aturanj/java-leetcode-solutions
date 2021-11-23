package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/second-largest-digit-in-a-string/
 */
public class SecondLargestDigitInString {

    public int secondHighest(String s) {

        var set = new HashSet<Integer>();

        for (var i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                set.add(Integer.valueOf("" + s.charAt(i)));
            }
        }

        var list = new ArrayList<Integer>(set);
        Collections.sort(list, Collections.reverseOrder());

        if (list.size() > 1) {
            return list.get(1); // second largest
        }

        return -1;
    }

    public static void main(String[] args) {
        var secondLargestDigit = new SecondLargestDigitInString();
        var result = secondLargestDigit.secondHighest("dfa12321afd");
        System.out.println("secondLargestDigit = " + secondLargestDigit);
        assertEquals(2, result);
    }
}
