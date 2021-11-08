package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/delete-columns-to-make-sorted/
 */
public class DeleteColumnsToMakeSorted {

    public int minDeletionSize(String[] strs) {

        var counter = 0;

        for (var i = 0; i < strs[0].length(); i++) {
            for (var j = 1; j < strs.length; j++) {
                if (Character.getNumericValue(strs[j].charAt(i))
                        < Character.getNumericValue(strs[j - 1].charAt(i))) {
                    counter++;
                    break;
                }
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        var deleteColumnsToMakeSorted = new DeleteColumnsToMakeSorted();
        var result = deleteColumnsToMakeSorted.minDeletionSize(new String[]{
            "cba",
            "daf",
            "ghi"
        });
        System.out.println("result = " + result);
        assertEquals(1, result);
    }
}
