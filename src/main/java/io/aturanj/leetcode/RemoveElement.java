package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/remove-element/
 */
public class RemoveElement {

    public int removeElement(int[] nums, int val) {

        int counter = 0;
        int i = 0;

        while (i < nums.length - counter) {

            if (nums[i] == val) {

                counter++;

                for (int j = i; j < nums.length - 1; j++) {
                    nums[j] = nums[j + 1]; //shift element
                }
            } else {
                i++;
            }

            System.out.println("i: " + i);
        }

        return nums.length - counter;
    }

    public static void main(String[] args) {

        RemoveElement removeElement = new RemoveElement();
        var result = removeElement.removeElement(new int[]{0, 1, 2, 2, 3, 0, 4, 2}, 2);

        System.out.println("result = " + result);
    }
}
