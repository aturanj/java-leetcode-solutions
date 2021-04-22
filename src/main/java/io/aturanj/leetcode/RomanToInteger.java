package io.aturanj.leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/roman-to-integer/
 */
public class RomanToInteger {

    public int romanToInt(String s) {

        Map<String, Integer> romans = new HashMap<>();
        romans.put("I", 1);
        romans.put("V", 5);
        romans.put("X", 10);
        romans.put("L", 50);
        romans.put("C", 100);
        romans.put("D", 500);
        romans.put("M", 1000);
        romans.put("IV", 4);
        romans.put("IX", 9);
        romans.put("XL", 40);
        romans.put("XC", 90);
        romans.put("CD", 400);
        romans.put("CM", 900);

        int number = 0;

        for (int i = 0; i < s.length(); i++) {

            if (i + 1 < s.length() && romans.get("" + s.charAt(i) + s.charAt(i + 1)) != null) {

                number += romans.get("" + s.charAt(i) + s.charAt(i + 1));

                i++;

            } else if (romans.get("" + s.charAt(i)) != null) {

                number += romans.get("" + s.charAt(i));
            }
        }

        return number;
    }

    public static void main(String[] args) {

        RomanToInteger romanToInteger = new RomanToInteger();
        var result = romanToInteger.romanToInt("MCMXCIV");

        System.out.println("result = " + result);
    }
}
