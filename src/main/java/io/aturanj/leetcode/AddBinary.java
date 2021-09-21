package io.aturanj.leetcode;

/**
 * https://leetcode.com/problems/add-binary/
 */
public class AddBinary {

    public String addBinary(String a, String b) {

        var pointerOne = a.length() - 1;
        var pointerTwo = b.length() - 1;
        var carry = 0;
        var sb = new StringBuilder();

        while (pointerOne >= 0 || pointerTwo >= 0) {
            var sum = 0;

            if (pointerOne >= 0) {
                sum += Integer.parseInt(a.charAt(pointerOne) + "");
            }
            if (pointerTwo >= 0) {
                sum += Integer.parseInt(b.charAt(pointerTwo) + "");
            }
            sum += carry;

            sb.append(sum % 2);
            carry = sum / 2;

            pointerOne--;
            pointerTwo--;
        }

        if (carry > 0) {
            sb.append(carry);
        }

        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        var addBinary = new AddBinary();
        var result = addBinary.addBinary(
                "10100000100100110110010000010101111011011001101110111111111101000000101111001110001111100001101",
                "110101001011101110001111100110001010100001101011101010000011011011001011101111001100000011011110011"
        );
        System.out.println("result = " + result);
    }
}
