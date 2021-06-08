package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/group-anagrams/
 */
public class GroupAnagrams {

    public List<List<String>> groupAnagrams(String[] strs) {

        Map<String, List<String>> map = new HashMap<>();

        for (var item : strs) {

            var element = item.toCharArray();
            Arrays.sort(element);
            var elementString = String.valueOf(element);

            if (map.get(elementString) == null) {
                List<String> list = new ArrayList<>();
                list.add(item);
                map.put(elementString, list);
            } else {
                var value = map.get(elementString);
                value.add(item);
                map.put(elementString, value);
            }
        }

        List<List<String>> list = new ArrayList<>();

        map.values().forEach(item -> {
            list.add(item);
        });

        return list;
    }

    public static void main(String[] args) {
        GroupAnagrams ga = new GroupAnagrams();
        var result = ga.groupAnagrams(
                new String[]{"eat", "tea", "tan", "ate", "nat", "bat"});

        System.out.println("result = " + Arrays.toString(result.toArray()));
    }
}
