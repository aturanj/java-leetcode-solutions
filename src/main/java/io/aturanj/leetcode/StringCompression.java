package io.aturanj.leetcode;

import java.util.ArrayList;

/**
 * https://leetcode.com/problems/string-compression/
 */
public class StringCompression {

    public int compress(char[] chars) {

        var list = new ArrayList<Character>();
        char prev = ' ';
        var counter = 0;

        for (var item : chars) {
            if (prev != ' ' && item != prev) {
                list.add(prev);
                if (counter > 1) {
                    for (var element : String.valueOf(counter).toCharArray()) {
                        list.add(element);
                    }
                }
                counter = 1;
            } else {
                counter++;
            }

            prev = item;
        }

        if (counter > 0) {
            list.add(prev);
            if (counter > 1) {
                for (var element : String.valueOf(counter).toCharArray()) {
                    list.add(element);
                }
            }
        }

        list.forEach(x -> System.out.println(x));

        for (int i = 0; i < list.size(); i++) {
            chars[i] = list.get(i);
        }

        return list.size();
    }

    public static void main(String[] args) {
        var stringCompression = new StringCompression();
        var result = stringCompression.compress(new char[]{'a',
            'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b', 'b'});
        System.out.println("result = " + result);
    }
}
