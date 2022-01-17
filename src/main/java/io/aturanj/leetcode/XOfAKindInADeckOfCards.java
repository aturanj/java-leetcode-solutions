package io.aturanj.leetcode;

import java.util.HashMap;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
 */
public class XOfAKindInADeckOfCards {

    public boolean hasGroupsSizeX(int[] deck) {

        if (deck.length < 2) {
            return false;
        }

        var map = new HashMap<Integer, Integer>();

        for (var item : deck) {
            map.put(item, map.getOrDefault(item, 0) + 1);
        }

        var gcd = Integer.MAX_VALUE;
        var list = map.values().stream().collect(Collectors.toList());

        for (var i = 1; i < map.size(); i++) {

            var calc = calculateGreatestCommonDivisor(list.get(i - 1), list.get(i));

            if (calc < gcd) {
                gcd = calc;
            }
        }

        return gcd >= 2;
    }

    private int calculateGreatestCommonDivisor(int a, int b) {

        var divisor = 0;

        for (var i = 1; i <= a && i <= b; i++) {
            if (a % i == 0 && b % i == 0) {
                divisor = i;
            }
        }

        return divisor;
    }

    public static void main(String[] args) {
        var aDeckOfCards = new XOfAKindInADeckOfCards();
        var result = aDeckOfCards.hasGroupsSizeX(
                new int[]{1, 1, 1, 2, 2, 2, 3, 3}
        );
        System.out.println("result = " + result);
        assertFalse(result);
    }
}
