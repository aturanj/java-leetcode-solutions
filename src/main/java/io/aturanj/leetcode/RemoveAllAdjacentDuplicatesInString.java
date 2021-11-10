package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
 */
public class RemoveAllAdjacentDuplicatesInString {

    public String removeDuplicates(String s) {

        var sb = new StringBuffer(s);

        for (var i = 0; i < sb.length() - 1;) {
            if (Character.compare(sb.charAt(i), sb.charAt(i + 1)) == 0) {
                sb.deleteCharAt(i + 1);
                sb.deleteCharAt(i);
                i--;
                if (i < 0) {
                    i = 0;
                }
            } else {
                i++;
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        var removeDuplicates = new RemoveAllAdjacentDuplicatesInString();
        var result = removeDuplicates.removeDuplicates("abbaca");
        System.out.println("result = " + result);
        assertEquals("ca", result);
    }
}
