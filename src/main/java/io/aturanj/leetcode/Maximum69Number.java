package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/maximum-69-number/
 */
public class Maximum69Number {

    public int maximum69Number(int num) {

        var numText = String.valueOf(num);
        var sb = new StringBuilder();
        var isChanged = false;

        for (int i = 0; i < numText.length(); i++) {
            if (numText.charAt(i) == '6' && !isChanged) {
                sb.append('9');
                isChanged = true;
            } else {
                sb.append(numText.charAt(i));
            }
        }

        return Integer.parseInt(sb.toString());
    }

    public static void main(String[] args) {
        Maximum69Number number = new Maximum69Number();
        var result = number.maximum69Number(9669);
        System.out.println("result = " + result);
    }
}
