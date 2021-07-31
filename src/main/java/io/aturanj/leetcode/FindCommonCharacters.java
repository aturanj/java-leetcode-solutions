package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * https://leetcode.com/problems/find-common-characters/
 */
public class FindCommonCharacters {

    public List<String> commonChars(String[] words) {

        var list = new ArrayList<HashMap>();

        for (var item : words) {

            var map = new HashMap<Character, Integer>();

            for (var element : item.toCharArray()) {
                map.put(element, map.get(element) == null ? 1 : map.get(element) + 1);
            }

            list.add(map);
        }

        var result = new ArrayList<String>();

        for (var sample : words[0].toCharArray()) {

            var isCommon = true;
            var minCount = Integer.MAX_VALUE;

            for (HashMap<Character, Integer> item : list) {
                if (item.get(sample) == null) {
                    isCommon = false;
                } else {
                    if (item.get(sample) < minCount) {
                        minCount = item.get(sample);
                    }
                }
            }

            if (isCommon == true && !result.contains(sample + "")) {
                for (var i = 0; i < minCount; i++) {
                    result.add(sample + "");
                }
            }
        }

        return result;
    }

    public static void main(String[] args) {
        var findCommonCharacters = new FindCommonCharacters();
        var result = findCommonCharacters
                .commonChars(new String[]{"bella", "label", "roller"});
        System.out.println("result = " + result);
    }
}
