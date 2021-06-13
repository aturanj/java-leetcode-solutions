package io.aturanj.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 */
public class CheckIfTheSentenceIsPangram {

    public boolean checkIfPangram(String sentence) {

        Set<Character> set = new HashSet<>();

        for (var item : sentence.toCharArray()) {
            set.add(item);
        }

        return set.size() == 26; // Englsh alphabet letter count
    }

    public static void main(String[] args) {
        CheckIfTheSentenceIsPangram isPangram = new CheckIfTheSentenceIsPangram();
        var result = isPangram.checkIfPangram("thequickbrownfoxjumpsoverthelazydog");
        System.out.println("result = " + result);
    }
}
