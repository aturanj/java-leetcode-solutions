package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/replace-all-digits-with-characters/
 */
public class ReplaceAllDigitsWithCharacters {

    public String replaceDigits(String s) {

        Character previous = null;
        var array = s.toCharArray();
        var sb = new StringBuilder();

        for (int i = 0; i < array.length; i++) {

            if (i % 2 == 0) {
                previous = array[i];
                sb.append(previous);
            } else {
                var number = Character.getNumericValue(previous);
                var newNumber = number + Integer.parseInt("" + array[i]);

                var ch = Character.forDigit(newNumber, 36);
                sb.append(ch);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        ReplaceAllDigitsWithCharacters replace = new ReplaceAllDigitsWithCharacters();
        var result = replace.replaceDigits("a1b2c3d4e");
        System.out.println("result = " + result);
    }
}
