package io.aturanj.leetcode;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/find-the-highest-altitude/
 */
public class FindTheHighestAltitude {

    public int largestAltitude(int[] gain) {

        int[] altitudes = new int[gain.length + 1];

        for (int i = 0; i < gain.length; i++) {
            altitudes[i + 1] = gain[i] + altitudes[i];
        }

        System.out.println("altitudes= " + Arrays.toString(altitudes));

        return Arrays.stream(altitudes).max().getAsInt();
    }

    public static void main(String[] args) {

        FindTheHighestAltitude highestAltitudes = new FindTheHighestAltitude();
        var result = highestAltitudes.largestAltitude(new int[]{-5, 1, 5, 0, -7});

        System.out.println("result = " + result);
    }
}
