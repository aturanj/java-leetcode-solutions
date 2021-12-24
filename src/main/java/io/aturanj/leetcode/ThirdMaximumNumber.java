package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/third-maximum-number/
 */
public class ThirdMaximumNumber {

    public int thirdMax(int[] nums) {

        var set = new HashSet<Integer>();
        Arrays.stream(nums).forEach(x -> set.add(x));
        var list = new ArrayList<Integer>(set);
        Collections.sort(list, Collections.reverseOrder());

        return list.size() >= 3 ? list.get(2) : list.get(0);
    }

    public static void main(String[] args) {
        var thirdMaximumNumber = new ThirdMaximumNumber();
        var result = thirdMaximumNumber.thirdMax(new int[]{2, 2, 3, 1});
        System.out.println("result = " + result);
        assertEquals(1, result);
    }
}
