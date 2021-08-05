package io.aturanj.leetcode;

import java.util.HashSet;

/**
 * https://leetcode.com/problems/unique-email-addresses/
 */
public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {

        var set = new HashSet<String>();

        for (var item : emails) {

            var array = item.split("@");// two part

            array[0] = array[0].replaceAll("\\.", "");

            if (array[0].contains("+")) {
                array[0] = array[0].substring(0, array[0].indexOf("+"));
            }

            var cleanedEmail = array[0] + "@" + array[1];
            set.add(cleanedEmail);
            System.out.println("cleanedEmail = " + cleanedEmail);
        }

        return set.size();
    }

    public static void main(String[] args) {
        var uniqueEmail = new UniqueEmailAddresses();
        var result = uniqueEmail.numUniqueEmails(new String[]{
            "test.email+alex@leetcode.com",
            "test.e.mail+bob.cathy@leetcode.com",
            "testemail+david@lee.tcode.com"});
        System.out.println("unique result = " + result);
    }
}
