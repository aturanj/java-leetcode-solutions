package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/jump-game-ii/
 */
public class JumpGameII {

    public int jump(int[] nums) {

        if (nums.length <= 1) {
            return 0;
        }

        int stepCount = 0, current = 0, farthest = 0;

        for (int i = 0; i < nums.length - 1; i++) {

            var j = i + nums[i];
            farthest = Math.max(farthest, j);

            if (i == current) {
                stepCount++;
                current = farthest;

                if (current >= nums.length - 1) {
                    break;
                }
            }
        }

        return stepCount;
    }

    public static void main(String[] args) {
        var jumpGameII = new JumpGameII();
        var result = jumpGameII.jump(new int[]{2, 3, 1, 1, 4});
        var expected = 2;
        assertEquals(expected, result);
    }
}
