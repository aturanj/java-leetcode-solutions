package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;

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
}
