package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/reverse-integer/
 */
public class ReverseInteger {

    public int reverse(int x) {

        char[] tempArray1 = String.valueOf(x).toCharArray();
        var tempArray2 = new char[tempArray1.length];

        int j = tempArray1.length;

        for (int i = 0; i < tempArray1.length; i++) {
            j--;
            tempArray2[j] = tempArray1[i];
        }

        var tempArray3 = new String(tempArray2).replaceAll("-", "");

        Integer result = 0;

        try {
            result = Integer.parseInt(x < 0 ? "-" + tempArray3 : tempArray3);
        } catch (Exception e) {
            return 0;
        }

        return result;
    }

    public static void main(String[] args) {
        ReverseInteger reverseInteger = new ReverseInteger();
        var result = reverseInteger.reverse(-123);

        System.out.println("result = " + result);
    }

    public int reverseAlternative(int x) {

        String y = new StringBuilder(Math.abs(x) + "").reverse().toString();

        if (y.length() == 1) {
            return x;
        }

        try {
            return (x < 0 ? -1 : 1) * Integer.parseInt(y);
        } catch (NumberFormatException e) {
            return 0;
        }
    }
}
