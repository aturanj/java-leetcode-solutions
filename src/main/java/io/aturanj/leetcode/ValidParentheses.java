package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/valid-parentheses/
 */
public class ValidParentheses {

    public boolean isValid(String s) {

        if (s.length() == 1) {
            return false;
        }

        List<Character> stack = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {

            switch (String.valueOf(s.charAt(i))) {

                case "}":

                    if (stack.isEmpty()) {
                        return false;
                    }

                    if (Character.compare(stack.get(stack.size() - 1), "{".charAt(0)) != 0) {
                        return false;
                    }

                    stack.remove(stack.size() - 1);

                    break;

                case ")":

                    if (stack.isEmpty()) {
                        return false;
                    }

                    if (Character.compare(stack.get(stack.size() - 1), "(".charAt(0)) != 0) {
                        return false;
                    }

                    stack.remove(stack.size() - 1);

                    break;

                case "]":

                    if (stack.isEmpty()) {
                        return false;
                    }

                    if (Character.compare(stack.get(stack.size() - 1), "[".charAt(0)) != 0) {
                        return false;
                    }

                    stack.remove(stack.size() - 1);

                    break;

                case "{":
                case "(":
                case "[":

                    stack.add(s.charAt(i));

                    break;
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        ValidParentheses validParentheses = new ValidParentheses();
        var result = validParentheses.isValid("{[]}");

        System.out.println("result = " + result);
    }
}
