package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/remove-palindromic-subsequences/
 */
public class RemovePalindromicSubsequences {

    public int removePalindromeSub(String s) {

        if (checkPalindrome(s.toCharArray())) {
            return 1;
        } else {
            return 2;
        }
    }

    private boolean checkPalindrome(char[] s) {

        for (int i = 0, j = s.length - 1; i < j; i++, j--) {
            if (s[i] != s[j]) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        var remove = new RemovePalindromicSubsequences();
        var result = remove.removePalindromeSub("baabb");
        System.out.println("result = " + result);
    }
}
