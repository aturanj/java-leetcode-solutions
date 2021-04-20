package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/valid-sudoku/
 */
public class ValidSudoku {

    public boolean isValidSudoku(char[][] board) {

        if (board[0].length != 9 || board[1].length != 9) {
            return false;
        }

        for (int r = 0; r < 9; r = r + 3) {

            for (int c = 0; c < 9; c = c + 3) {

                List<Integer> list = new ArrayList();

                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 3; j++) {

                        var value = board[i + r][j + c];

                        if (value != '.') {

                            var intValue = Integer.valueOf(value);

                            if (!list.contains(intValue)) {

                                list.add(intValue);

                            } else {
                                return false;
                            }
                        }
                    }
                }
            }
        }

        for (int r = 0; r < 9; r++) {

            List<Integer> list = new ArrayList();

            for (int c = 0; c < 9; c++) {

                var value = board[r][c];

                if (value != '.') {

                    var intValue = Integer.valueOf(value);

                    if (!list.contains(intValue)) {

                        list.add(intValue);
                    } else {
                        return false;
                    }
                }
            }
        }

        for (int r = 0; r < 9; r++) {

            List<Integer> list = new ArrayList();

            for (int c = 0; c < 9; c++) {

                var value = board[c][r];

                if (value != '.') {

                    var intValue = Integer.valueOf(value);

                    if (!list.contains(intValue)) {

                        list.add(intValue);
                    } else {
                        return false;
                    }
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        ValidSudoku validSudoku = new ValidSudoku();
        var result = validSudoku.isValidSudoku(new char[][]{
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}});

        System.out.println("result = " + result);
    }
}
