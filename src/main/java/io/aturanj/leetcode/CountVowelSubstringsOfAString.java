package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/count-vowel-substrings-of-a-string/
 */
public class CountVowelSubstringsOfAString {

    public int countVowelSubstrings(String word) {

        var letters = Arrays.asList("a", "e", "i", "o", "u");
        var counter = 0;

        for (var i = 0; i < word.length(); i++) {
            for (var j = word.length() - 1; i < j; j--) {

                var sub = word.substring(i, j + 1);

                if (sub.length() >= letters.size()) {

                    var check = true;

                    for (var k = 0; k < letters.size(); k++) {
                        if (!sub.contains(letters.get(k))) {
                            check = false;
                            break;
                        }
                    }

                    for (var l : sub.toCharArray()) {
                        if (!letters.contains("" + l)) { // no vowel, consonant
                            check = false;
                            break;
                        }
                    }

                    if (check) {
                        counter++;
                        System.out.println(sub);
                    }
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        var countVowelSubstringsOfAString = new CountVowelSubstringsOfAString();
        var result = countVowelSubstringsOfAString.countVowelSubstrings("cuaieuouac");
        System.out.println("result = " + result);
        assertEquals(7, result);
    }
}
