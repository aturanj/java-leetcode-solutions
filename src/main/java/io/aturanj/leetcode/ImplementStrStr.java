package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/implement-strstr/
 */
public class ImplementStrStr {

    public int strStr(String haystack, String needle) {

        if (needle.isEmpty()) {
            return 0;
        }

        if (haystack.length() < needle.length()) {
            return -1;
        }

        for (int i = 0; i <= haystack.length() - needle.length(); i++) {

            if (haystack.charAt(i) == needle.charAt(0)) {

                for (int j = 0; j < needle.length(); j++) {

                    if (i + j < haystack.length()) {

                        if (haystack.charAt(i + j) != needle.charAt(j)) {
                            break;
                        }

                        if (j == needle.length() - 1) //last char
                        {
                            return i;
                        }
                    }
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        ImplementStrStr implementStrStr = new ImplementStrStr();
        var result = implementStrStr.strStr("hello", "ll");

        System.out.println("result = " + result);
    }
}
