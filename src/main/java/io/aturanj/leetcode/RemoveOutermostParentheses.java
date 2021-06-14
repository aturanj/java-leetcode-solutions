package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/remove-outermost-parentheses/
 */
public class RemoveOutermostParentheses {

    public String removeOuterParentheses(String s) {

        int rightCounter = 0;
        int leftCounter = 0;

        StringBuilder sb = new StringBuilder();

        String result = "";

        for (var item : s.toCharArray()) {

            switch (item) {
                case '(':
                    leftCounter++;
                    break;

                case ')':
                    rightCounter++;
                    break;
            }

            sb.append(item);

            if (rightCounter == leftCounter) {

                var temp = sb.toString();
                temp = temp.substring(1, temp.length() - 1); //removing

                sb.setLength(0);

                result += temp;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        RemoveOutermostParentheses removeOP = new RemoveOutermostParentheses();
        var result = removeOP.removeOuterParentheses("(()())(())");
        System.out.println("result = " + result);
    }
}
