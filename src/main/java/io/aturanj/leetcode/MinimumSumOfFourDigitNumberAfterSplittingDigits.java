package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * https://leetcode.com/problems/minimum-sum-of-four-digit-number-after-splitting-digits/
 */
public class MinimumSumOfFourDigitNumberAfterSplittingDigits {

    public int minimumSum(int num) {

        var list = new ArrayList<Integer>();
        var digits = num + "";

        for (var i = 1; i < digits.length(); i++) {

            var one = digits.substring(0, i);
            var two = digits.substring(i);

            var oneSorted = one.toCharArray();
            Arrays.sort(oneSorted);
            one = String.valueOf(oneSorted);

            var twoSorted = two.toCharArray();
            Arrays.sort(twoSorted);
            two = String.valueOf(twoSorted);

            System.out.println(one + "-" + two);
            list.add(Integer.valueOf(one) + Integer.valueOf(two));

            //TODO: Add more checks for edge cases
        }

        return Collections.min(list);
    }
}
