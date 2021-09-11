package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/determine-if-string-halves-are-alike/
 */
public class DetermineIfStringHalvesAreAlike {

    public boolean halvesAreAlike(String s) {

        s = s.toLowerCase();

        var counterOne = 0;
        var counterTwo = 0;

        for (var i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    if (i < s.length() / 2) {
                        counterOne++;
                    } else {
                        counterTwo++;
                    }
                    break;
            }
        }

        return counterOne == counterTwo;
    }

    public static void main(String[] args) {
        var determine = new DetermineIfStringHalvesAreAlike();
        var result = determine.halvesAreAlike("AbCdEfGh");
        System.out.println("result = " + result);
    }
}
