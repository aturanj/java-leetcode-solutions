package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

/**
 * https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/
 */
public class ReplaceElementWithGreatestElementOnRightSide {

    public int[] replaceElements(int[] arr) {

        var result = new int[arr.length];
        var max = 0;
        var maxIndex = 0;

        for (var i = 0; i < arr.length; i++) {

            if (maxIndex > i) {
                result[i] = max;
            } else {
                var subArray = Arrays.copyOfRange(arr, i + 1, arr.length);
                result[i] = Arrays.stream(subArray).max().orElse(-1);
                //memoization of max and max-index
                maxIndex = Arrays.asList(subArray).indexOf(result[i]);
                max = result[i];
            }
        }

        return result;
    }

    public static void main(String[] args) {
        var replaceElement = new ReplaceElementWithGreatestElementOnRightSide();
        var result = replaceElement.replaceElements(new int[]{17, 18, 5, 4, 6, 1});
        System.out.println("result = " + Arrays.toString(result));
        assertArrayEquals(new int[]{18, 6, 6, 6, 1, -1}, result);
    }
}
