package io.aturanj.leetcode;

import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/unique-morse-code-words/
 */
public class UniqueMorseCodeWords {

    public int uniqueMorseRepresentations(String[] words) {

        String[] morseAlphabet = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.",
            "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-",
            ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};

        Set<String> set = new HashSet<>();

        for (var item : words) {

            StringBuilder sb = new StringBuilder();

            for (var element : item.toCharArray()) {
                var index = Character.getNumericValue(element)
                        - Character.getNumericValue('a');
                sb.append(morseAlphabet[index]);
            }
            set.add(sb.toString());
        }

        return set.size();
    }

    public static void main(String[] args) {
        UniqueMorseCodeWords uniqueMorseCodeWords = new UniqueMorseCodeWords();
        var result = uniqueMorseCodeWords.uniqueMorseRepresentations(
                new String[]{"gin", "zen", "gig", "msg"});
        System.out.println("result = " + result);
    }
}
