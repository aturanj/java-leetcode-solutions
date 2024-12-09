package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/generate-parentheses/
 */
public class GenerateParentheses {

    List<String> list = new ArrayList<>();
    Integer maxParentheses = 0;

    public List<String> generateParenthesis(int n) {
        this.maxParentheses = n;
        generate(new StringBuilder(""), 0, 0);
        return list;
    }

    private void generate(StringBuilder currentText, int openParentheses, int closeParentheses) {

        if (currentText.length() == maxParentheses * 2) {
            list.add(currentText.toString());
            return;
        }

        if (openParentheses < maxParentheses) {
            generate(new StringBuilder(currentText).append("("), openParentheses + 1, closeParentheses);
        }
        if (openParentheses > closeParentheses) {
            generate(new StringBuilder(currentText).append(")"), openParentheses, closeParentheses + 1);
        }
    }

    public static void main(String[] args) {

        var generateParentheses = new GenerateParentheses();
        var result = generateParentheses.generateParenthesis(3);
        var expected = Arrays.asList("((()))", "(()())", "(())()", "()(())", "()()()");

        assertEquals(expected, result);
    }
}
