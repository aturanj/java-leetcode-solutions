package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/longest-common-prefix/
 */
public class LongestCommonPrefix {

    public String longestCommonPrefix(String[] strs) {

        if (strs == null || strs.length == 0) {
            return "";
        }

        List<char[]> list = new ArrayList<>();

        for (String item : strs) {
            var tempArray = item.toCharArray();
            list.add(tempArray);
        }

        StringBuilder sb = new StringBuilder();

        int tempCounter = 0;
        boolean isCompleted = false;

        while (!isCompleted) {

            var tempChar = ' ';

            for (int i = 0; i < list.size(); i++) {

                if (list.get(i).length > tempCounter) {

                    var item = list.get(i);

                    if (tempChar == ' ') {
                        tempChar = item[tempCounter];
                    } else if (tempChar != item[tempCounter]) {
                        isCompleted = true;
                        break;
                    }
                } else {
                    isCompleted = true;
                    break;
                }

                if (i == list.size() - 1) {
                    sb.append(tempChar);
                }
            }

            tempCounter++;
        }

        return sb.toString();
    }

    public static void main(String[] args) {

        LongestCommonPrefix longestCommonPrefix = new LongestCommonPrefix();
        var result = longestCommonPrefix.longestCommonPrefix(new String[]{"flower", "flo", "flx"});

        System.out.println("result = " + result);
    }
}
