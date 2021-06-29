package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/decompress-run-length-encoded-list/
 */
public class DecompressRunLengthEncodedList {

    public int[] decompressRLElist(int[] nums) {

        List<Integer> list = new ArrayList();

        for (int i = 0; i < nums.length - 1; i += 2) {

            System.out.println("i : " + i);

            for (int j = 0; j < nums[i]; j++) {
                list.add(nums[i + 1]);
                System.out.println(nums[i + 1]);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    public static void main(String[] args) {
        DecompressRunLengthEncodedList decompress = new DecompressRunLengthEncodedList();
        var result = decompress.decompressRLElist(new int[]{1, 2, 3, 4});
        System.out.println("result = " + Arrays.toString(result));
    }
}
