package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/ransom-note/
 */
public class RansomNote {

    public boolean canConstruct(String ransomNote, String magazine) {

        var sb = new StringBuilder(magazine);

        for (var letter : ransomNote.toCharArray()) {

            var index = sb.indexOf("" + letter);

            if (index == -1) {
                return false;
            } else {
                sb.setCharAt(index, '_');
            }
        }

        return true;
    }

    public static void main(String[] args) {
        var ransomNote = new RansomNote();
        var result = ransomNote.canConstruct("aa", "aab");
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
