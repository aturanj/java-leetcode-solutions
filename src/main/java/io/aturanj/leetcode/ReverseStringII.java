package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/reverse-string-ii/
 */
public class ReverseStringII {

    public String reverseStr(String s, int k) {

        var sb = new StringBuilder();
        var modulusFactor = s.length() <= k ? k : 2 * k;

        for (var i = 0; i < s.length(); i++) {
            if (i % modulusFactor == 0) {
                var lastIndex = i + k >= s.length() ? s.length() : i + k;
                var element = new StringBuilder(s.substring(i, lastIndex));
                element.reverse();

                sb.append(element.toString());
                i += k - 1;
            } else {
                sb.append(s.charAt(i));
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        var reverseString = new ReverseStringII();
        var result = reverseString.reverseStr("abcdefg", 2);
        System.out.println("result = " + result);
    }
}
