package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/sum-of-unique-elements/
 */
public class SumOfUniqueElements {

    public int sumOfUnique(int[] nums) {

        List<Integer> listOfNonunique = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        for (var item : nums) {
            if (!set.add(item)) {
                listOfNonunique.add(item);
            }
        }

        listOfNonunique.forEach(item -> {
            set.remove(item);
        });

        return set.stream().mapToInt(x -> x).sum();
    }

    public static void main(String[] args) {
        SumOfUniqueElements SumOfUniqueElements = new SumOfUniqueElements();
        var result = SumOfUniqueElements.sumOfUnique(new int[]{1, 2, 3, 2});
        System.out.println("result = " + result);
    }
}
