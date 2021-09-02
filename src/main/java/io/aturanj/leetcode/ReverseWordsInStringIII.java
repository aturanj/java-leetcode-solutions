package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/reverse-words-in-a-string-iii/
 */
public class ReverseWordsInStringIII {

    public String reverseWords(String s) {

        var sb = new StringBuilder();

        for (var item : s.split(" ")) {
            var element = new StringBuilder(item);
            element.reverse();

            sb.append(element.toString()).append(" ");
        }

        sb.setLength(sb.length() - 1); //remove last space

        return sb.toString();
    }

    public static void main(String[] args) {
        var reverse = new ReverseWordsInStringIII();
        var result = reverse.reverseWords("Let's take LeetCode contest");
        System.out.println("result = " + result);
    }
}
