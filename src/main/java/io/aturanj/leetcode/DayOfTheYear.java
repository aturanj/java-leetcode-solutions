package io.aturanj.leetcode;

import java.time.LocalDate;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/day-of-the-year/
 */
public class DayOfTheYear {

    public int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }

    public static void main(String[] args) {
        var dayOfTheYear = new DayOfTheYear();
        var result = dayOfTheYear.dayOfYear("2019-02-10");
        System.out.println("result = " + result);
        assertEquals(41, result);
    }
}
