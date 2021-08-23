package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/count-items-matching-a-rule/
 */
public class CountItemsMatchingARule {

    public int countMatches(List<List<String>> items,
            String ruleKey,
            String ruleValue) {

        var counter = 0;

        for (var item : items) {
            switch (ruleKey) {
                case "type":
                    if (item.get(0).equals(ruleValue)) {
                        counter++;
                    }
                    break;
                case "color":
                    if (item.get(1).equals(ruleValue)) {
                        counter++;
                    }
                    break;
                case "name":
                    if (item.get(2).equals(ruleValue)) {
                        counter++;
                    }
                    break;
            }
        }

        return counter;
    }

    public static void main(String[] args) {

        var items = new ArrayList<List<String>>();
        items.add(Arrays.asList("phone", "blue", "pixel"));
        items.add(Arrays.asList("computer", "silver", "phone"));
        items.add(Arrays.asList("phone", "gold", "iphone"));

        var countItems = new CountItemsMatchingARule();
        var result = countItems.countMatches(items, "type", "phone");
        System.out.println("result = " + result);
    }
}
