package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/crawler-log-folder/
 */
public class CrawlerLogFolder {

    public int minOperations(String[] logs) {

        var counter = 0;

        for (var item : logs) {
            switch (item) {
                case "./":
                    break;
                case "../":
                    if (counter > 0) {
                        counter--;
                    }
                    break;
                default:
                    counter++;
                    break;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        var crawlerLogFolder = new CrawlerLogFolder();
        var result = crawlerLogFolder.minOperations(
                new String[]{"d1/", "d2/", "./", "d3/", "../", "d31/"}
        );
        System.out.println("result = " + result);
        assertEquals(3, result);
    }
}
