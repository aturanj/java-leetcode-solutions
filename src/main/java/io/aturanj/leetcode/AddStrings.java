package io.aturanj.leetcode;

import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/add-strings/
 */
public class AddStrings {

    public String addStrings(String num1, String num2) {
        return new BigInteger(num1).add(new BigInteger(num2)).toString();
    }

    public static void main(String[] args) {
        var add = new AddStrings();
        var result = add.addStrings("6913259244", "71103343");
        System.out.println("result = " + result);
        assertEquals(result, "6984362587");
    }
}
