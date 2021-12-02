package io.aturanj.leetcode;

import java.math.BigInteger;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/contains-duplicate-iii/
 */
public class ContainsDuplicateIII {

    public boolean containsNearbyAlmostDuplicate(int[] nums, int k, int t) {

        var set = new HashSet<String>();

        for (var i = 0; i < nums.length; i++) {
            for (var j = 0; j < nums.length; j++) {

                if (i != j
                        && !set.contains(i + "#" + j)
                        && !set.contains(j + "#" + i)
                        && Math.abs(i - j) <= k
                        && (new BigInteger("" + nums[i])
                                .subtract(new BigInteger("" + nums[j])))
                                .abs()
                                .compareTo(new BigInteger("" + t)) <= 0) {
                    return true;
                }

                set.add(i + "#" + j);
                set.add(j + "#" + i);
            }
        }

        return false;
    }

    public static void main(String[] args) {
        var containsDuplicateIII = new ContainsDuplicateIII();
        var result = containsDuplicateIII.containsNearbyAlmostDuplicate(
                new int[]{1, 0, 1, 1},
                1, 2);
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
