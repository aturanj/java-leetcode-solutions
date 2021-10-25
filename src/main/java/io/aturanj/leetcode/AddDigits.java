package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/add-digits/
 */
public class AddDigits {

    public int addDigits(int num) {

        var numberString = num + "";

        System.out.println(numberString);

        if (numberString.length() == 1) {
            return num;
        }

        var sum = 0;

        for (var item : numberString.toCharArray()) {
            sum += Integer.parseInt(item + "");
        }

        return addDigits(sum);
    }

    public static void main(String[] args) {
        var addDigits = new AddDigits();
        var result = addDigits.addDigits(38);
        System.out.println("result = " + result);
        assertEquals(2, result);
    }
}
