package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/bulb-switcher-iv/
 */
public class BulbSwitcherIV {

    public int minFlips(String target) {

        char pointer = '0';
        int counter = 0;

        var sb = new StringBuilder();

        for (var item : target.toCharArray()) {

            if (item != pointer) {
                if (pointer == '0') {
                    pointer = '1';
                } else {
                    pointer = '0';
                }
                counter++;
            }

            sb.append(pointer);
            System.out.println(sb.toString());
        }
        return counter;

    }

    public static void main(String[] args) {
        var bulbSwitcher = new BulbSwitcherIV();
        var result = bulbSwitcher.minFlips("10111");
        System.out.println("result = " + result);
    }
}
