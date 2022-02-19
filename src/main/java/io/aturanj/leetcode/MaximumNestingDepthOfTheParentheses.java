package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
 */
public class MaximumNestingDepthOfTheParentheses {

    public int maxDepth(String s) {

        var counter = 0;
        var max = 0;

        for (var ch : s.toCharArray()) {

            switch (ch) {
                case '(' ->
                    counter++;

                case ')' ->
                    counter--;
            }

            if (max < counter) {
                max = counter;
            }
        }

        return max;
    }

    public static void main(String[] args) {
        var depthOfTheParentheses = new MaximumNestingDepthOfTheParentheses();
        var result = depthOfTheParentheses.maxDepth("(1+(2*3)+((8)/4))+1");
        System.out.println("result = " + result);
        assertEquals(3, result);
    }
}
