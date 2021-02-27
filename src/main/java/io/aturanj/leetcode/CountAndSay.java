package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/count-and-say/
 */
public class CountAndSay {

    public String countAndSay(int n) {

        List<String> list = new ArrayList<>();
        list.add("1");

        for (int i = 1; i < n; i++) {

            String tempText = list.get(i - 1);

            int counter = 0;
            char tempChar = tempText.charAt(0);

            StringBuilder sb = new StringBuilder();

            for (int k = 0; k <= tempText.length(); k++) {

                if (k <= tempText.length() - 1 && tempText.charAt(k) == tempChar) {
                    counter++;
                } else {
                    sb.append(counter).append(tempChar);

                    if (k <= tempText.length() - 1) {
                        counter = 1;
                        tempChar = tempText.charAt(k);
                    }
                }
            }

            list.add(sb.toString());
        }

        return list.get(list.size() - 1);
    }

    public static void main(String[] args) {
        CountAndSay countAndSay = new CountAndSay();
        countAndSay.countAndSay(4);
    }
}
