package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/first-unique-character-in-a-string/
 */
public class FirstUniqueCharacterInAString {

    public int firstUniqChar(String s) {

        if (s == null || s.isEmpty()) {
            return -1;
        }

        for (int i = 0; i < s.length(); i++) {

            StringBuilder temp = new StringBuilder(s);
            var tempChar = s.charAt(i);

            if (temp.deleteCharAt(i).indexOf(String.valueOf(tempChar)) == -1) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        FirstUniqueCharacterInAString firstUniqueCharacterInAString
                = new FirstUniqueCharacterInAString();
        var result = firstUniqueCharacterInAString.firstUniqChar("loveleetcode");

        System.out.println("result = " + result);
    }
}
