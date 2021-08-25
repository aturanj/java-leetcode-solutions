package io.aturanj.leetcode;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/zigzag-conversion/
 */
public class ZigZagConversion {

    public String convert(String s, int numRows) {

        var list = new ArrayList<StringBuilder>();
        int i = 0;

        while (i < s.length()) {
            for (int j = 0; j < numRows && i < s.length(); j++) {
                if (list.size() <= j) {
                    list.add(new StringBuilder());
                }
                list.get(j).append(s.charAt(i++));
            }
            for (int j = numRows - 2; j > 0 && i < s.length(); j--) {
                list.get(j).append(s.charAt(i++));
            }
        }

        var result = new StringBuilder();
        list.stream().forEach(x -> result.append(x.toString()));
        return result.toString();
    }

    public static void main(String[] args) {
        var zigZagConversion = new ZigZagConversion();
        var result = zigZagConversion.convert("PAYPALISHIRING", 4);
        System.out.println("result = " + result);
    }
}
