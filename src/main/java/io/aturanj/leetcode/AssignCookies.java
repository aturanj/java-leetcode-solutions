package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/assign-cookies/
 */
public class AssignCookies {

    public int findContentChildren(int[] g, int[] s) {

        Arrays.sort(g); // children
        Arrays.sort(s); // cookies

        var counter = 0; // children who can get cookies

        for (var i = 0; i < s.length && counter < g.length; i++) {
            if (s[i] >= g[counter]) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        var assignCookies = new AssignCookies();
        var result = assignCookies.findContentChildren(
                new int[]{1, 2},
                new int[]{1, 2, 3}
        );
        System.out.println("result = " + result);
        assertEquals(2, result);
    }
}
