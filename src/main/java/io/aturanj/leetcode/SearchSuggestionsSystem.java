package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/search-suggestions-system/
 */
public class SearchSuggestionsSystem {

    public List<List<String>> suggestedProducts(String[] products, String searchWord) {

        var sb = new StringBuilder();
        var resultList = new ArrayList<List<String>>();

        for (var item : searchWord.toCharArray()) {

            var text = sb.append(item).toString();
            var list = new ArrayList<String>();

            for (var element : products) {
                if (element.length() >= text.length()
                        && text.equals(element.substring(0, text.length()))) {
                    list.add(element);
                }
            }
            Collections.sort(list);
            resultList.add(list.stream().limit(3).collect(Collectors.toList()));
        }

        return resultList;
    }

    public static void main(String[] args) {

        var searchSuggestionsSystem = new SearchSuggestionsSystem();
        var result = searchSuggestionsSystem.suggestedProducts(
                new String[]{"mobile", "mouse", "moneypot", "monitor", "mousepad"},
                "mouse");
        result.forEach(
                x -> {
                    x.forEach(y -> System.out.print(y + " "));
                    System.out.println("");
                }
        );
    }
}
