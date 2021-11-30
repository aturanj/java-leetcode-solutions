package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/number-complement/
 */
public class NumberComplement {

    public int findComplement(int num) {
        var text = Integer.toBinaryString(num);
        text = text.replace("0", "_").replace("1", "0").replace("_", "1");
        return Integer.parseInt(text, 2);
    }

    public static void main(String[] args) {
        var numberComplement = new NumberComplement();
        var result = numberComplement.findComplement(5);
        System.out.println("result = " + result);
        assertEquals(2, result);
    }
}
