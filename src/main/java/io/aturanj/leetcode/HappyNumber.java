package io.aturanj.leetcode;

import java.util.HashSet;
import java.util.Set;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/happy-number/
 */
public class HappyNumber {

    private final Set cyclicSet = new HashSet<Integer>();

    public boolean isHappy(int n) {

        var text = String.valueOf(n);
        var sum = 0;

        for (var item : text.toCharArray()) {
            sum += Math.pow(Integer.parseInt(item + ""), 2);
        }

        if (!cyclicSet.add(sum)) {
            return false;
        }

        return sum == 1 ? true : isHappy(sum);
    }

    public static void main(String[] args) {
        var happyNumber = new HappyNumber();
        var result = happyNumber.isHappy(19);
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
