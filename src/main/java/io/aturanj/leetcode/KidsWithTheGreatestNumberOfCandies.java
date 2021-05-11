package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author root
 */
public class KidsWithTheGreatestNumberOfCandies {

    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {

        int greatest = 0;
        List<Boolean> candyList = new ArrayList<>();

        for (int item : candies) {
            if (item > greatest) {
                greatest = item;
            }
        }

        for (int item : candies) {
            if ((item + extraCandies) >= greatest) {
                candyList.add(true);
            } else {
                candyList.add(false);
            }
        }

        return candyList;
    }

    public static void main(String[] args) {

        KidsWithTheGreatestNumberOfCandies greatestNumberOfCandies
                = new KidsWithTheGreatestNumberOfCandies();

        var result = greatestNumberOfCandies
                .kidsWithCandies(new int[]{2, 3, 5, 1, 3}, 3);

        System.out.println("result = " + Arrays.toString(result.toArray()));
    }
}
