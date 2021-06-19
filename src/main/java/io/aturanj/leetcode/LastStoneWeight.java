package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/last-stone-weight/
 */
public class LastStoneWeight {

    public int lastStoneWeight(int[] stones) {

        if (stones.length == 1) {
            return stones[0];
        }

        for (int i = 0; i < stones.length; i++) {
            Arrays.sort(stones);
            var stone1 = stones[stones.length - 1];//first heaviest stone
            var stone2 = stones[stones.length - 2];//second heaviest stone

            stones[stones.length - 1] = 0;
            stones[stones.length - 2] = stone1 - stone2;//smashing stones
        }

        Arrays.sort(stones);
        return stones[stones.length - 1]; //last stone weight
    }

    public static void main(String[] args) {
        LastStoneWeight lastStoneWeight = new LastStoneWeight();
        var result = lastStoneWeight.lastStoneWeight(new int[]{2, 7, 4, 1, 8, 1});
        System.out.println("result = " + result);
    }
}
