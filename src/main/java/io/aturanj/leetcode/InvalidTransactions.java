package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * https://leetcode.com/problems/invalid-transactions/
 */
public class InvalidTransactions {

    public List<String> invalidTransactions(String[] transactions) {

        var set = new HashSet<Integer>();

        for (var j = 0; j < transactions.length; j++) {
            for (var i = 0; i < transactions.length; i++) {

                var fist = transactions[i].split("\\,");
                var fistAmount = Integer.valueOf(fist[2]);
                var fistName = fist[0];
                var fistTime = Integer.valueOf(fist[1]);
                var fistCity = fist[3];

                var second = transactions[j].split("\\,");
                var secondName = second[0];
                var secondTime = Integer.valueOf(second[1]);
                var secondCity = second[3];

                if (fistAmount > 1000) {
                    set.add(i);
                } else if (Math.abs(fistTime - secondTime) <= 60
                        && fistName.equals(secondName)
                        && !fistCity.equals(secondCity)) {
                    set.add(i);
                    set.add(j);
                }
            }
        }

        var list = new ArrayList<String>();

        set.forEach(index -> {
            list.add(transactions[index]);
        });

        return list;
    }

    public static void main(String[] args) {
        InvalidTransactions transactions = new InvalidTransactions();
        var result = transactions.invalidTransactions(new String[]{
            "alex,676,260,bangkok",
            "bob,656,1366,bangkok",
            "alex,393,616,bangkok",
            "bob,820,990,amsterdam",
            "alex,596,1390,amsterdam"});
        System.out.println("result = " + result);
    }
}
