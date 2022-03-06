package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/check-if-all-as-appears-before-all-bs/
 */
public class CheckIfAllAsAppearsBeforeAllBs {

    public boolean checkString(String s) {

        var arrayOne = s.toCharArray();
        var arrayTwo = s.toCharArray();

        Arrays.sort(arrayTwo);

        return Arrays.equals(arrayOne, arrayTwo);
    }

    public static void main(String[] args) {
        var checkIfAllAsAppearsBeforeAllBs = new CheckIfAllAsAppearsBeforeAllBs();
        var result = checkIfAllAsAppearsBeforeAllBs.checkString("aaabbb");
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
