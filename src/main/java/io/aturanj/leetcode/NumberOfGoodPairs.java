package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/number-of-good-pairs/submissions/
 */
public class NumberOfGoodPairs {

    public int numIdenticalPairs(int[] nums) {

        if (nums == null || nums.length == 0) {
            return 0;
        }

        List<Integer> list = new ArrayList<>();
        int counter = 0;

        for (int num : nums) {
            if (list.contains(num)) {
                counter++;
            } else {
                list.add(num);
            }
        }

        return counter != 0 ? ++counter : counter;
    }
}
