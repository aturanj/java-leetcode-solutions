package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * https://leetcode.com/problems/nim-game/
 */
public class NimGame {

    public boolean canWinNim(int n) {
        return n % 4 == 0 ? false : true;
    }

    public static void main(String[] args) {
        var nimGame = new NimGame();
        var result = nimGame.canWinNim(8);
        assertFalse(result);
    }
}
