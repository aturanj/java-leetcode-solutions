package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * https://leetcode.com/problems/design-an-ordered-stream/
 */
public class OrderedStream {

    Map<Integer, String> stream;
    int counter = 1;

    public OrderedStream(int n) {
        stream = new HashMap<>(n + 1);
    }

    public List<String> insert(int idKey, String value) {

        stream.put(idKey, value);

        List<String> list = new ArrayList<>();

        while (stream.get(idKey) != null && stream.get(counter) != null) {

            list.add(stream.get(counter));

            counter++;
        }

        return list;
    }

    public static void main(String[] args) {

        OrderedStream orderedStream = new OrderedStream(5);

        System.out.println(Arrays.toString(orderedStream.insert(3, "ccccc").toArray()));
        System.out.println(Arrays.toString(orderedStream.insert(1, "aaaaa").toArray()));
        System.out.println(Arrays.toString(orderedStream.insert(2, "bbbbb").toArray()));
        System.out.println(Arrays.toString(orderedStream.insert(5, "eeeee").toArray()));
        System.out.println(Arrays.toString(orderedStream.insert(4, "ddddd").toArray()));
    }
}

/**
 * Your OrderedStream object will be instantiated and called as such:
 * OrderedStream obj = new OrderedStream(n); List<String> param_1 =
 * obj.insert(idKey,value);
 */
