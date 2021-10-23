package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/reverse-vowels-of-a-string/
 */
public class ReverseVowelsOfString {

    public String reverseVowels(String s) {

        var vowels = Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U');
        var sb = new StringBuilder();

        for (var ch : s.toCharArray()) {
            if (vowels.contains(ch)) {
                sb.append(ch);
            }
        }

        var vowelsArray = sb.reverse().toString().toCharArray();
        var sbResult = new StringBuilder(s);
        var index = 0;

        for (var i = 0; i < s.length(); i++) {
            if (vowels.contains(sbResult.charAt(i))) {
                sbResult.setCharAt(i, vowelsArray[index]);
                index++;
            }
        }

        return sbResult.toString();
    }

    public static void main(String[] args) {
        var reverseVowelsOfString = new ReverseVowelsOfString();
        var result = reverseVowelsOfString.reverseVowels("leetcode");
        System.out.println("result = " + result);
        assertEquals("leotcede", result);
    }
}
