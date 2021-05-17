package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/count-good-triplets/
 */
public class CountGoodTriplets {

    public int countGoodTriplets(int[] arr, int a, int b, int c) {

        int l = arr.length;

        List<String> list = new ArrayList();

        for (int i = 0; i < l; i++) {

            for (int j = 0; j < l; j++) {

                for (int k = 0; k < l; k++) {

                    if ((i < j && j < k && k < l)
                            && Math.abs(arr[i] - arr[j]) <= a
                            && Math.abs(arr[j] - arr[k]) <= b
                            && Math.abs(arr[i] - arr[k]) <= c) {

                        list.add("(" + arr[i] + "," + arr[j] + "," + arr[k] + ")");
                    }
                }
            }
        }

        System.out.println("Good Triples = " + Arrays.toString(list.toArray()));

        return list.size();
    }

    public static void main(String[] args) {
        CountGoodTriplets cgt = new CountGoodTriplets();
        var result = cgt.countGoodTriplets(new int[]{3, 0, 1, 1, 9, 7}, 7, 2, 3);

        System.out.println("result = " + result);
    }
}
