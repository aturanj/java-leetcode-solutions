package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/self-dividing-numbers/
 */
public class SelfDividingNumbers {

    public List<Integer> selfDividingNumbers(int left, int right) {

        List<Integer> list = new ArrayList<>();

        for (int i = left; i <= right; i++) {

            var arr = (i + "").toCharArray();

            boolean valid = true;

            for (var item : arr) {

                if (item == '0' || !(i % Integer.valueOf(item + "") == 0)) {
                    valid = false;
                }
            }

            if (valid) {
                list.add(i);
            }
        }

        return list;
    }

    public static void main(String[] args) {
        SelfDividingNumbers selfDividingNumbers = new SelfDividingNumbers();
        var list = selfDividingNumbers.selfDividingNumbers(47, 85);

        String result = list.stream()
                .map(x -> String.valueOf(x))
                .collect(Collectors.joining(","));

        System.out.println("result = " + result);
    }
}
