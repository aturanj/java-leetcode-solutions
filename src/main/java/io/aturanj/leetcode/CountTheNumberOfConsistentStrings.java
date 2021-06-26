package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/count-the-number-of-consistent-strings/
 */
public class CountTheNumberOfConsistentStrings {

    public int countConsistentStrings(String allowed, String[] words) {

        var consistentCounter = 0;

        char[] allowedArray = allowed.toCharArray();

        for (var item : words) {

            var consistent = false;
            var counter = 0;

            for (var element : item.toCharArray()) {
                for (var letter : allowedArray) {
                    if (letter == element) {
                        consistent = true;
                        counter++;
                        break;
                    }
                }

                if (consistent && counter == item.toCharArray().length) {
                    consistentCounter++;
                    break;
                }
            }
        }

        return consistentCounter;
    }

    public static void main(String[] args) {
        CountTheNumberOfConsistentStrings numberOfConsistentStrings
                = new CountTheNumberOfConsistentStrings();
        var result = numberOfConsistentStrings
                .countConsistentStrings("ab", new String[]{"ad", "bd", "aaab", "baa", "badab"});
        System.out.println("result = " + result);
    }
}
