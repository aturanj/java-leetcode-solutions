package io.aturanj.leetcode;

import java.text.DecimalFormat;
import java.util.Arrays;
import org.junit.jupiter.api.Assertions;

/**
 * https://leetcode.com/problems/reformat-date/
 */
public class ReformatDate {

    public String reformatDate(String date) {

        var arrayDate = date.split(" ");
        var day = new StringBuilder();

        arrayDate[0].chars().forEach(x -> {
            if (Character.isDigit(x)) {
                day.append(Character.toString(x));
            }
        });

        var months = Arrays.asList("Jan", "Feb", "Mar", "Apr", "May", "Jun",
                "Jul", "Aug", "Sep", "Oct", "Nov", "Dec");
        var month = months.indexOf(arrayDate[1]) + 1;

        var year = arrayDate[2];

        var formatter = new DecimalFormat("00");

        return year + "-"
                + formatter.format(month) + "-"
                + formatter.format(Integer.valueOf(day.toString()));
    }

    public static void main(String[] args) {
        var reformatDate = new ReformatDate();
        var result = reformatDate.reformatDate("6th Jun 1933");
        System.out.println("result = " + result);
        Assertions.assertEquals("1933-06-06", result);
    }
}
