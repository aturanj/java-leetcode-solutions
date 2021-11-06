package io.aturanj.leetcode;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/reformat-phone-number/
 */
public class ReformatPhoneNumber {

    public String reformatNumber(String number) {

        number = number.replace(" ", "").replace("-", "");
        var sb = new StringBuilder();

        if (number.length() > 4) {
            var index = 0;
            var carrier = "";

            while (index < number.length() - 4) {
                sb.append(number.substring(index, index + 3)).append("-");
                carrier = number.substring(index + 3, number.length());
                index += 3;
            }

            if (carrier.length() == 4) {
                reformatForFour(sb, carrier);
            } else {
                sb.append(carrier);
            }
        } else if (number.length() == 4) {
            reformatForFour(sb, number);
        } else {
            return number;
        }

        return sb.toString();
    }

    private void reformatForFour(StringBuilder sb, String four) {
        sb.append(four.substring(0, 2))
                .append("-")
                .append(four.substring(2, 4));
    }

    public static void main(String[] args) {
        var reformatPhoneNumber = new ReformatPhoneNumber();
        var result = reformatPhoneNumber.reformatNumber("--17-5 229 35-39475 ");
        System.out.println("result = " + result);
        assertEquals("175-229-353-94-75", result);
    }
}
