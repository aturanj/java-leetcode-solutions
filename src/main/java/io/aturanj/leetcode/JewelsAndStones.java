package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 */
public class JewelsAndStones {

    public int numJewelsInStones(String jewels, String stones) {

        char[] jewelArray = jewels.toCharArray();

        int counter = 0;

        for (char stone : stones.toCharArray()) {

            boolean contains = false;

            for (char jewel : jewelArray) {
                if (jewel == stone) {
                    contains = true;
                }
            }

            if (contains) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        var result = jewelsAndStones.numJewelsInStones("aA", "aaaaaAAAAABBBB");
        System.out.println("result = " + result);
    }
}
