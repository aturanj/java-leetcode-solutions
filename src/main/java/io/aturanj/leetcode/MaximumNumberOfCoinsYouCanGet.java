package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode.com/problems/maximum-number-of-coins-you-can-get/
 */
public class MaximumNumberOfCoinsYouCanGet {

    public int maxCoins(int[] piles) {

        List<Integer> myList = new ArrayList();

        //sort max elements before
        piles = Arrays.stream(piles)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();

        int counter = 1; // alice got 0, I will get 1

        for (int i = 0; i < piles.length / 3; i++) {

            var me = piles[counter];
            myList.add(me);

            counter += 2; // get max elements for only alice and me, bob gets minumum elements and it's not important what he takes
        }

        return myList.stream().reduce(0, (a, b) -> a + b);
    }

    public static void main(String[] args) {

        MaximumNumberOfCoinsYouCanGet maximumNumberOfCoinsYouCanGet
                = new MaximumNumberOfCoinsYouCanGet();

        var result = maximumNumberOfCoinsYouCanGet.maxCoins(new int[]{9, 8, 7, 6, 5, 1, 2, 3, 4});

        System.out.println("result = " + result);
    }
}
