package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/divisor-game/
 */
public class DivisorGame {

    public boolean divisorGame(int n) {

        boolean turnOfAlice = true;

        while (n > 1) {

            int counter = 1;
            while (counter < n) {
                if (n % counter == 0) {
                    break;
                }
                counter++;
            }

            n -= counter;

            turnOfAlice = !turnOfAlice;
        }

        return !turnOfAlice;
    }

    public static void main(String[] args) {
        var game = new DivisorGame();
        var result = game.divisorGame(2);
        System.out.println("result = " + result);
    }
}
