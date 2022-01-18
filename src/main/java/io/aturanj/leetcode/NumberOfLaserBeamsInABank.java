package io.aturanj.leetcode;

import java.util.ArrayList;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/number-of-laser-beams-in-a-bank/
 */
public class NumberOfLaserBeamsInABank {

    public int numberOfBeams(String[] bank) {

        var list = new ArrayList<Long>();

        for (var row : bank) {
            var count = row.chars().filter(x -> x == '1').count();
            if (count > 0) {
                list.add(count);
            }
        }

        var sum = 0;

        for (var i = 1; i < list.size(); i++) {
            sum += list.get(i) * list.get(i - 1);
        }

        return sum;
    }

    public static void main(String[] args) {
        var numberOflazerBeams = new NumberOfLaserBeamsInABank();
        var result = numberOflazerBeams.numberOfBeams(
                new String[]{
                    "011001",
                    "000000",
                    "010100",
                    "001000"}
        );
        System.out.println("result = " + result);
        assertEquals(8, result);
    }
}
