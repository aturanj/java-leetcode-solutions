package io.aturanj.leetcode;

import java.util.Stack;

/**
 * https://leetcode.com/problems/baseball-game/
 */
public class BaseballGame {

    public int calPoints(String[] ops) {

        int previous = 0;
        Stack<Integer> stack = new Stack<>();

        for (var item : ops) {
            if (isInteger(item)) {
                var number = Integer.valueOf(item);
                stack.push(number);
                previous = number;
            } else {
                switch (item) {
                    case "C":
                        stack.pop();
                        previous = stack.empty() ? 0 : stack.peek();
                        break;

                    case "D":
                        stack.push(2 * stack.peek());
                        previous = stack.empty() ? 0 : stack.peek();
                        break;

                    case "+":
                        var numberOne = stack.pop();
                        var numberTwo = stack.peek();
                        stack.push(numberOne);
                        stack.push(numberOne + numberTwo);
                        previous = stack.empty() ? 0 : stack.peek();
                        break;
                }
            }
        }

        int sum = 0;

        while (!stack.empty()) {
            sum += stack.pop();
        }

        return sum;
    }

    private boolean isInteger(String item) {
        try {
            Integer.parseInt(item);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        BaseballGame baseballGame = new BaseballGame();
        var result = baseballGame.calPoints(new String[]{"5", "-2", "4", "C", "D", "9", "+", "+"});
        System.out.println("result = " + result);
    }
}
