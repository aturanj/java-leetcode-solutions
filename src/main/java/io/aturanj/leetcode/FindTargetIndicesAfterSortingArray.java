package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/find-target-indices-after-sorting-array/
 */
public class FindTargetIndicesAfterSortingArray {

    public List<Integer> targetIndices(int[] nums, int target) {

        Arrays.sort(nums);

        var list = new ArrayList<Integer>();

        for (var i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        var findTargetIndices = new FindTargetIndicesAfterSortingArray();
        var result = findTargetIndices.targetIndices(
                new int[]{1, 2, 5, 2, 3},
                2
        );
        System.out.println("result = " + result);
        assertEquals(Arrays.asList(1, 2), result);
    }
}
