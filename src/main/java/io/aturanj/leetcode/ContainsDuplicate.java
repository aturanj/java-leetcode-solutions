package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/contains-duplicate/
 */
public class ContainsDuplicate {

    public boolean containsDuplicate(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int item : nums) {

            /**
             * The function adds the element only if the specified element is
             * not already present in the set else the function return False if
             * the element is already present in the Set.
             */
            if (!set.add(item)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        ContainsDuplicate containsDuplicate = new ContainsDuplicate();
        int[] array = {1, 2, 3, 1};
        System.out.println("Result : " + containsDuplicate.containsDuplicate(array));
    }

    public boolean containsDuplicateAlternative(int[] nums) {

        List<Integer> list = new ArrayList<>();

        for (int num : nums) {

            if (list.contains(num)) {
                return true;
            } else {
                list.add(num);
            }
        }

        return false;
    }
}
