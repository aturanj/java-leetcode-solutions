package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://leetcode.com/problems/partition-labels/
 */
public class PartitionLabels {

    public List<Integer> partitionLabels(String s) {

        var maxIndex = s.lastIndexOf(s.charAt(0) + "");
        var list = new ArrayList<String>();
        var i = 0;
        var startCharIndex = 0;

        while (i < s.length()) {

            for (; i <= maxIndex; i++) {
                maxIndex = Math.max(maxIndex, s.lastIndexOf(s.charAt(i) + ""));
            }

            var part = s.substring(startCharIndex, maxIndex + 1);

            list.add(part);

            i = startCharIndex = maxIndex = maxIndex + 1;
        }

        return list.stream().map(x -> x.length()).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        var partitionLabels = new PartitionLabels();
        var result = partitionLabels.partitionLabels("ababcbacadefegdehijhklij");
        result.forEach(x -> System.out.println(x));
    }
}
