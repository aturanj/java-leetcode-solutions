package io.aturanj.leetcode;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicBoolean;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/validate-ip-address/
 */
public class ValidateIpAddress {

    public String validIPAddress(String queryIP) {

        if (queryIP == null || queryIP.equals("")) {
            return "Neither";
        }

        var digits = Arrays.asList("0", "1", "2", "3", "4", "5", "6", "7", "8", "9");
        var hex = Arrays.asList("a", "b", "c", "d", "e", "f", "A", "B", "C", "D", "E", "F");

        if (queryIP.contains(":")) { // IPv6 check

            if (queryIP.charAt(0) == ':' || queryIP.charAt(queryIP.length() - 1) == ':') {
                return "Neither";
            }

            var array = queryIP.split(":");

            if (array.length != 8) {
                return "Neither";
            }

            for (var item : array) {

                if (item == null || item.trim().equals("") || item.length() > 4) {
                    return "Neither";
                }

                var isValid = new AtomicBoolean(true);
                item.chars().forEach(x -> {
                    if (!digits.contains(Character.toString(x))
                            && !hex.contains(Character.toString(x))) {
                        isValid.set(false);
                    }
                });
                if (!isValid.get()) {
                    return "Neither";
                }
            }

            return "IPv6";

        } else { // IPv4 check

            if (queryIP.charAt(0) == '.' || queryIP.charAt(queryIP.length() - 1) == '.') {
                return "Neither";
            }

            var array = queryIP.split("\\.");

            if (array.length != 4) {
                return "Neither";
            }

            for (var item : array) {

                if (item == null || item.trim().equals("")) {
                    return "Neither";
                }

                var isNumber = new AtomicBoolean(true);
                item.chars().forEach(x -> {
                    if (!digits.contains(Character.toString(x))) {
                        isNumber.set(false);
                    }
                });
                if (!isNumber.get()) {
                    return "Neither";
                }

                if (new BigInteger(item).compareTo(java.math.BigInteger.ZERO) == -1
                        || new BigInteger(item).compareTo(new BigInteger("255")) == 1) {
                    return "Neither";
                }

                //leading zero check
                if (Integer.valueOf(item).toString().length() != item.length()) {
                    return "Neither";
                }
            }

            return "IPv4";
        }
    }

    public static void main(String[] args) {

        var validateIpAddress = new ValidateIpAddress();

        var resultOne = validateIpAddress.validIPAddress("172.16.254.1");
        System.out.println("resultOne = " + resultOne);
        assertEquals("IPv4", resultOne);

        var resultTwo = validateIpAddress.validIPAddress("2001:0db8:85a3:0:0:8A2E:0370:7334");
        System.out.println("resultTwo = " + resultTwo);
        assertEquals("IPv6", resultTwo);
    }
}
