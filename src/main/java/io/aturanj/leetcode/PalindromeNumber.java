package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/palindrome-number/
 */
public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x < 0) {
            return false;
        }

        var text = String.valueOf(x);
        var length = text.length();

        for (int i = 0, j = length - 1; i < length / 2; i++, j--) {
            if (text.charAt(i) != text.charAt(j)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        PalindromeNumber palindromeNumber = new PalindromeNumber();
        var result = palindromeNumber.isPalindrome(123454321);
        System.out.println("result = " + result);
    }
}
