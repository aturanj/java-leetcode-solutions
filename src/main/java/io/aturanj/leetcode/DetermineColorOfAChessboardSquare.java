package io.aturanj.leetcode;

import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * https://leetcode.com/problems/determine-color-of-a-chessboard-square/
 */
public class DetermineColorOfAChessboardSquare {

    public boolean squareIsWhite(String coordinates) {
        var letter = coordinates.charAt(0);
        var indexOfLetter = Arrays
                .asList('a', 'b', 'c', 'd', 'e', 'f', 'g', 'h')
                .indexOf(letter);
        var number = Integer.valueOf("" + coordinates.charAt(1));
        return (indexOfLetter + number) % 2 == 0;
    }

    public static void main(String[] args) {
        var determineColor = new DetermineColorOfAChessboardSquare();
        var result = determineColor.squareIsWhite("c7");
        System.out.println("result = " + result);
        assertFalse(result);
    }
}
