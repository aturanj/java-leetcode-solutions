package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/rings-and-rods/
 */
public class RingsAndRods {

    public int countPoints(String rings) {

        var map = new HashMap<Integer, List<Character>>();
        var colors = Arrays.asList('R', 'G', 'B');

        for (var i = 0; i < rings.length(); i += 2) {
            var character = rings.charAt(i);
            var number = Integer.valueOf(rings.charAt(i + 1));
            var value = map.getOrDefault(number, new ArrayList<>());
            value.add(character);
            map.put(number, value);
        }

        var counter = 0;
        counter = map.entrySet()
                .stream()
                .filter(pair -> pair.getValue().containsAll(colors))
                .map(item -> 1)
                .reduce(counter, Integer::sum);
        return counter;
    }

    public static void main(String[] args) {
        var ringsAndRods = new RingsAndRods();
        var result = ringsAndRods.countPoints("B0B6G0R6R0R6G9");
        System.out.println("result = " + result);
        assertEquals(1, result);
    }
}
