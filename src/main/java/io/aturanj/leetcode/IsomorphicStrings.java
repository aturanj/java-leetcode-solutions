package io.aturanj.leetcode;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/isomorphic-strings/
 */
public class IsomorphicStrings {

    public boolean isIsomorphic(String s, String t) {

        if (s.length() != t.length()) {
            return false;
        }

        var map = new LinkedHashMap<Character, Character>();
        var set = new LinkedHashSet<Character>();

        for (var i = 0; i < s.length(); i++) {

            var charS = s.charAt(i);
            var charT = t.charAt(i);

            if (!map.containsKey(charS)) {
                if (set.contains(charT)) {
                    return false;
                } else {
                    map.put(charS, charT);
                    set.add(charT);
                }
            } else if (map.get(charS) != charT) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        var isomorphicStrings = new IsomorphicStrings();
        var result = isomorphicStrings.isIsomorphic("egg", "add");
        System.out.println("result = " + result);
        assertEquals(result, true);
    }
}
