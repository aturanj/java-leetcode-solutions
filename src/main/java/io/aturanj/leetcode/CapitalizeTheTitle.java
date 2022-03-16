package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/capitalize-the-title/
 */
public class CapitalizeTheTitle {

    public String capitalizeTitle(String title) {

        var words = title.split(" ");
        var sb = new StringBuilder();

        for (var word : words) {

            word = word.toLowerCase();

            if (word.length() > 2) {
                sb.append(word.substring(0, 1).toUpperCase())
                        .append(word.substring(1))
                        .append(" ");
            } else {
                sb.append(word).append(" ");
            }
        }

        sb.setLength(sb.length() - 1);

        return sb.toString();
    }

    public static void main(String[] args) {
        var title = new CapitalizeTheTitle();
        var result = title.capitalizeTitle("capiTalIze tHe titLe");
        System.out.println("result = " + result);
        assertEquals("Capitalize The Title", result);
    }
}
