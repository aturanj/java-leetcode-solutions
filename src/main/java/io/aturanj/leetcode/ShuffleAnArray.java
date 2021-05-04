package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * https://leetcode.com/problems/shuffle-an-array/
 */
public class ShuffleAnArray {

    int[] tempNums;

    public ShuffleAnArray(int[] nums) {

        this.tempNums = nums;
    }

    /**
     * Resets the array to its original configuration and return it.
     */
    public int[] reset() {

        System.out.println("reset = " + Arrays.toString(tempNums));

        return this.tempNums;
    }

    /**
     * Returns a random shuffling of the array.
     */
    public int[] shuffle() {

        int[] tempShuffleNums = new int[tempNums.length];

        boolean isOk = false;

        Set<Integer> set = new HashSet<>();

        int counter = 0;

        int max = tempNums.length;

        int min = 0;

        while (!isOk) {

            int index = (int) ((Math.random() * (max - min)) + min);

            if (!set.contains(index)) {

                tempShuffleNums[counter] = tempNums[index];
                set.add(index);
                counter++;
            }

            if (counter == tempNums.length) {
                isOk = true;
            }
        }

        System.out.println("shuffle = " + Arrays.toString(tempShuffleNums));

        return tempShuffleNums;
    }

    public static void main(String[] args) {

        ShuffleAnArray shuffleAnArray = new ShuffleAnArray(new int[]{1, 2, 3});

        shuffleAnArray.shuffle();
        shuffleAnArray.reset();
        shuffleAnArray.shuffle();
    }
}

/**
 * Your Solution object will be instantiated and called as such: Solution obj =
 * new Solution(nums); int[] param_1 = obj.reset(); int[] param_2 =
 * obj.shuffle();
 */
