package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/shuffle-the-array/
 */
public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {

        int[] suffledArray = new int[2 * n];
        int index = 0;

        for (int i = 0, j = n; i < n; i++, j++) {
            suffledArray[index++] = nums[i];
            suffledArray[index++] = nums[j];
        }

        return suffledArray;
    }

    public static void main(String[] args) {

        ShuffleTheArray shuffleTheArray = new ShuffleTheArray();
        var result = shuffleTheArray.shuffle(new int[]{1, 2, 3, 4, 4, 3, 2, 1}, 4);

        System.out.println("result = " + result);
    }
}
