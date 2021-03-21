package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/valid-palindrome/
 */
public class ValidPalindrome {

    public boolean isPalindrome(String s) {

        s = s.replaceAll("[^a-zA-Z0-9]", "").replaceAll(" ", "").toLowerCase();

        if (s.isEmpty()) {
            return true;
        }

        for (int i = 0, j = s.length() - 1; i < s.length() / 2; i++, j--) {

            if (Character.compare(s.charAt(i), s.charAt(j)) != 0) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        ValidPalindrome validPalindrome = new ValidPalindrome();
        var result = validPalindrome.isPalindrome("A man, a plan, a canal: Panama");

        System.out.println("isPalindrome = " + result);
    }

    public boolean isPalindromeAlternative(String s) {

        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {

            while (i < j && !Character.isLetterOrDigit(s.charAt(i))) {
                i++;
            }

            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) {
                j--;
            }

            if (i < j && Character.toLowerCase(s.charAt(i)) != Character.toLowerCase(s.charAt(j))) {
                return false;
            }
        }

        return true;
    }
}
