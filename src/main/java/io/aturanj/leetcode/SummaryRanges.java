package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/summary-ranges/
 */
public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {

        var map = new HashMap<Integer, StringBuilder>();
        Arrays.sort(nums);

        var prev = Long.MIN_VALUE;
        var index = -1;

        for (var item : nums) {
            if (item != prev + 1) {

                index++;

                var sb = map.getOrDefault(index, new StringBuilder());
                sb.append(item);
                map.put(index, sb);
            } else {
                var sb = map.getOrDefault(index, new StringBuilder());
                if (sb.toString().contains("->")) {
                    sb.setLength(sb.indexOf("-")); //delete ending value of the range and add new endind value
                }
                sb.append("->").append(item);
            }

            prev = item;
        }

        return map.values().stream().map(x -> x.toString()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        var summaryRanges = new SummaryRanges();
        var result = summaryRanges.summaryRanges(new int[]{0, 1, 2, 4, 5, 7});
        System.out.println("result = " + result);
        assertEquals(Arrays.asList("0->2", "4->5", "7"), result);
    }
}
