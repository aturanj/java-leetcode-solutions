package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 */
public class CheckIfArrayIsSortedAndRotated {

    public boolean check(int[] nums) {

        var list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        Arrays.sort(nums);
        var listSorted = Arrays.stream(nums).boxed().collect(Collectors.toList());

        for (var i = 0; i < nums.length; i++) {

            list.add(list.remove(0));

            if (listSorted.equals(list)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        var checkIfArrayIsSortedAndRotated = new CheckIfArrayIsSortedAndRotated();
        var result = checkIfArrayIsSortedAndRotated.check(new int[]{3, 4, 5, 1, 2});
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
