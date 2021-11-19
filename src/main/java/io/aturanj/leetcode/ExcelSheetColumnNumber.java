package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/excel-sheet-column-number/
 */
public class ExcelSheetColumnNumber {

    public int titleToNumber(String columnTitle) {

        var sum = 0;
        var englishAlphaberLetterCount = 26;

        for (var letter : columnTitle.toCharArray()) {
            var item = letter - 'A';
            sum = sum * englishAlphaberLetterCount + item + 1;
        }
        return sum;
    }

    public static void main(String[] args) {
        var excelSheetColumnNumber = new ExcelSheetColumnNumber();
        var result = excelSheetColumnNumber.titleToNumber("FXSHRXW");
        System.out.println("result = " + result);
        assertEquals(2147483647, result);
    }
}
