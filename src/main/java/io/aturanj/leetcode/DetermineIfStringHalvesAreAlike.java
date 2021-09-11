package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/determine-if-string-halves-are-alike/
 */
public class DetermineIfStringHalvesAreAlike {

    public boolean halvesAreAlike(String s) {
        s = s.toLowerCase();

        var counterOne = 0;

        for (var i = 0; i < s.length() / 2; i++) {
            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counterOne++;
                    break;
            }
        }
        var counterTwo = 0;

        for (var i = s.length() / 2; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                    counterTwo++;
                    break;
            }

        }
        return counterOne == counterTwo;
    }
}
