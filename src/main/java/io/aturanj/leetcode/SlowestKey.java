package io.aturanj.leetcode;

import java.util.HashMap;

/**
 * https://leetcode.com/problems/slowest-key/
 */
public class SlowestKey {

    public char slowestKey(int[] releaseTimes, String keysPressed) {

        var map = new HashMap<Character, Integer>();
        map.put(keysPressed.charAt(0), releaseTimes[0]);

        for (var i = 1; i < releaseTimes.length; i++) {

            var diff = releaseTimes[i] - releaseTimes[i - 1];

            if ((map.containsKey(keysPressed.charAt(i)) && diff > map.get(keysPressed.charAt(i)))
                    || (!map.containsKey(keysPressed.charAt(i)))) {
                map.put(keysPressed.charAt(i), diff);
            }
        }

        int max = 0;
        char ch = '0';
        for (var item : map.entrySet()) {
            if ((item.getValue() == max && item.getKey() > ch) || (item.getValue() > max)) {
                max = item.getValue();
                ch = item.getKey();
            }
        }

        return ch;
    }

    public static void main(String[] args) {
        var slowestKey = new SlowestKey();
        var result = slowestKey.slowestKey(new int[]{9, 29, 49, 50}, "cbcd");
        System.out.println("result = " + result);
    }
}
