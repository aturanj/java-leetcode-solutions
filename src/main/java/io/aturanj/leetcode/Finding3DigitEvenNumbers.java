package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://leetcode.com/problems/finding-3-digit-even-numbers/
 */
public class Finding3DigitEvenNumbers {

    public int[] findEvenNumbers(int[] digits) {

        var set = new HashSet<Integer>();

        for (var i = 0; i < digits.length; i++) {
            for (var j = 0; j < digits.length; j++) {
                for (var k = 0; k < digits.length; k++) {

                    if (digits[i] != 0 && i != j && j != k && i != k) {

                        var number = Integer.valueOf("" + digits[i] + digits[j] + digits[k]);

                        if (number % 2 == 0) {
                            set.add(number);
                        }
                    }
                }
            }
        }

        var result = set.stream().mapToInt(Integer::intValue).toArray();

        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        var finding3DigitEvenNumbers = new Finding3DigitEvenNumbers();
        var result = finding3DigitEvenNumbers.findEvenNumbers(
                new int[]{2, 1, 3, 0}
        );
        System.out.println("result = " + Arrays.toString(result));
        assertArrayEquals(
                new int[]{102, 120, 130, 132, 210, 230, 302, 310, 312, 320},
                result
        );
    }
}
