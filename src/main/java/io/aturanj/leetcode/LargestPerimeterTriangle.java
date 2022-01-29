package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/largest-perimeter-triangle/
 */
public class LargestPerimeterTriangle {

    public int largestPerimeter(int[] nums) {

        Arrays.sort(nums);

        var maxPerimeter = 0;

        for (var i = 0; i + 2 < nums.length; i++) {
            if (nums[i] + nums[i + 1] > nums[i + 2]) {
                maxPerimeter = nums[i] + nums[i + 1] + nums[i + 2];
            }
        }

        return maxPerimeter > 0 ? maxPerimeter : 0;
    }

    public static void main(String[] args) {
        var triangle = new LargestPerimeterTriangle();
        var result = triangle.largestPerimeter(new int[]{2, 1, 2});
        System.out.println("result = " + result);
        assertEquals(5, result);
    }
}
