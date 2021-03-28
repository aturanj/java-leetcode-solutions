package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/4sum/
 */
public class FourSum {

    public List<List<Integer>> fourSum(int[] nums, int target) {

        List<List<Integer>> list = new ArrayList<>();

        if (nums == null || nums.length < 4) {
            return list;
        }

        Arrays.sort(nums);

        for (int i = 0; i < nums.length - 3; i++) {

            if (i != 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            for (int j = i + 1; j < nums.length - 2; j++) {

                if (j != i + 1 && nums[j] == nums[j - 1]) {
                    continue;
                }

                int k = j + 1;

                int l = nums.length - 1;

                while (k < l) {

                    if (nums[i] + nums[j] + nums[k] + nums[l] < target) {
                        k++;
                    } else if (nums[i] + nums[j] + nums[k] + nums[l] > target) {
                        l--;
                    } else {

                        List<Integer> quadruplet = new ArrayList<>();
                        quadruplet.add(nums[i]);
                        quadruplet.add(nums[j]);
                        quadruplet.add(nums[k]);
                        quadruplet.add(nums[l]);
                        list.add(quadruplet);

                        k++;
                        l--;

                        while (k < l && nums[l] == nums[l + 1]) {
                            l--;
                        }

                        while (k < l && nums[k] == nums[k - 1]) {
                            k++;
                        }
                    }

                }
            }
        }

        return list;
    }

    public static void main(String[] args) {

        FourSum fourSum = new FourSum();
        var list = fourSum.fourSum(new int[]{1, 0, -1, 0, -2, 2}, 0);

        String result = list.stream()
                .map(x -> String.valueOf(x))
                .collect(Collectors.joining(","));

        System.out.println("result = " + result);
    }
}
