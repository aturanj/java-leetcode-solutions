package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * https://leetcode.com/problems/queries-on-a-permutation-with-key/
 */
public class QueriesOnAPermutationWithKey {

    public int[] processQueries(int[] queries, int m) {

        var list = new LinkedList<Integer>();
        var resultList = new ArrayList<Integer>();

        for (var i = 1; i <= m; i++) {
            list.add(i);
        }

        for (var i = 0; i < queries.length; i++) {
            var elementInt = queries[i];
            var elementInteger = Integer.valueOf(elementInt);

            var item = list.indexOf(elementInteger);
            resultList.add(item);

            list.remove(elementInteger);
            list.addFirst(elementInteger);
        }

        return resultList.stream().mapToInt(x -> x).toArray();
    }

    public static void main(String[] args) {
        var queriesOnPermutation = new QueriesOnAPermutationWithKey();
        var result = queriesOnPermutation
                .processQueries(new int[]{7, 5, 5, 8, 3}, 8);
        System.out.println("result = " + Arrays.toString(result));
    }
}
