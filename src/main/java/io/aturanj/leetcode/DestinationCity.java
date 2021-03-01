package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/destination-city/
 */
public class DestinationCity {

    public String destCity(List<List<String>> paths) {

        if (paths == null || paths.isEmpty()) {
            return "";
        }

        List<String> departurePointList = new ArrayList<>();

        paths.forEach(list -> {
            departurePointList.add((String) list.get(0));
        });

        for (List list : paths) {
            if (!departurePointList.contains((String) list.get(1))) {
                return (String) list.get(1);
            }
        }

        return "";
    }
}
