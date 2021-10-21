package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/random-pick-index/
 */
public class RandomPickIndex {

    List list = new ArrayList<Integer>();

    public RandomPickIndex(int[] nums) {
        list = Arrays.stream(nums).boxed().collect(Collectors.toList());
    }

    public int pick(int target) {
        var tempList = new ArrayList<Integer>(list);
        var indexList = new ArrayList<Integer>();
        var index = 0;

        do {
            index = tempList.indexOf(target);
            if (index != -1) {
                tempList.set(index, Integer.MAX_VALUE);
                indexList.add(index);
            }
        } while (index != -1);

        int randomIndex = (int) (Math.random() * indexList.size());

        System.out.println(indexList.get(randomIndex));

        return indexList.get(randomIndex);
    }

    public static void main(String[] args) {
        var nums = new int[]{1, 2, 3, 3, 3};
        var randomPickIndex = new RandomPickIndex(nums);
        assertEquals(3, nums[randomPickIndex.pick(3)]);
        assertEquals(1, nums[randomPickIndex.pick(1)]);
        assertEquals(3, nums[randomPickIndex.pick(3)]);
    }
}
