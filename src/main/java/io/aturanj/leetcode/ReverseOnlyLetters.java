package io.aturanj.leetcode;

import java.util.Stack;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/reverse-only-letters/
 */
public class ReverseOnlyLetters {

    public String reverseOnlyLetters(String s) {

        var stack = new Stack<Character>();

        for (var item : s.toCharArray()) {
            if (Character.isLetter(item)) {
                stack.push(item);
            }
        }

        var sb = new StringBuffer();

        for (var item : s.toCharArray()) {
            if (!Character.isLetter(item)) {
                sb.append(item);
            } else {
                sb.append(stack.pop());
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        var reverse = new ReverseOnlyLetters();
        var result = reverse.reverseOnlyLetters("a-bC-dEf-ghIj");
        System.out.println("result = " + result);
        assertEquals("j-Ih-gfE-dCba", result);
    }
}
