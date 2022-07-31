package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/keep-multiplying-found-values-by-two/
 */
public class KeepMultiplyingFoundValuesByTwo {

    public int findFinalValue(int[] nums, int original) {

        var list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        while (list.contains(original)) {
            original *= 2;
        }

        return original;
    }

    public static void main(String[] args) {
        var keepMultiplying = new KeepMultiplyingFoundValuesByTwo();
        var result = keepMultiplying.findFinalValue(new int[]{5, 3, 6, 1, 12}, 3);
        System.out.println("result = " + result);
        assertEquals(24, result);
    }
}
