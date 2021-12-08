package io.aturanj.leetcode;

import java.time.LocalDate;
import java.util.Arrays;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/day-of-the-week/
 */
public class DayOfTheWeek {

    public String dayOfTheWeek(int day, int month, int year) {

        var daysOfWeek = Arrays.asList("Sunday", "Monday", "Tuesday",
                "Wednesday", "Thursday", "Friday", "Saturday");

        var date = LocalDate.of(year, month, day);

        return daysOfWeek.stream()
                .filter(x -> x.equalsIgnoreCase(date.getDayOfWeek().toString()))
                .findFirst()
                .get();
    }

    public static void main(String[] args) {
        var day = new DayOfTheWeek();
        var result = day.dayOfTheWeek(15, 8, 1993);
        System.out.println("result = " + result);
        assertEquals("Sunday", result);
    }
}
