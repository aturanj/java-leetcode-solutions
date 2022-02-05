package io.aturanj.leetcode;

import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/find-words-that-can-be-formed-by-characters/
 */
public class FindWordsThatCanBeFormedByCharacters {

    public int countCharacters(String[] words, String chars) {

        var charList = chars
                .chars()
                .mapToObj(e -> (char) e)
                .collect(Collectors.toList());

        var sum = 0;

        for (var word : words) {

            sum += word.length();

            var tempList = charList
                    .stream()
                    .collect(Collectors.toList());

            for (var ch : word.toCharArray()) {
                if (!tempList.contains(ch)) {
                    sum -= word.length();
                    break;
                } else {
                    tempList.remove(Character.valueOf(ch));
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        var findWords = new FindWordsThatCanBeFormedByCharacters();
        var result = findWords.countCharacters(
                new String[]{"hello", "world", "leetcode"},
                "welldonehoneyr"
        );
        System.out.println("result = " + result);
        assertEquals(10, result);
    }
}
