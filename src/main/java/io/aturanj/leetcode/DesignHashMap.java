package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/design-hashmap/
 */
public class DesignHashMap {

    List<Pair> list;

    public DesignHashMap() {
        list = new ArrayList<Pair>();
    }

    public void put(int key, int value) {
        var pair = list.stream().filter(x -> x.key == key).findFirst();
        if (pair.isPresent()) {
            list.remove(pair.get());
        }
        list.add(new Pair(key, value));
    }

    public int get(int key) {
        var pair = list.stream().filter(x -> x.key == key).findFirst();
        if (pair.isPresent()) {
            return pair.get().value;
        } else {
            return -1;
        }
    }

    public void remove(int key) {
        var pair = list.stream().filter(x -> x.key == key).findFirst();
        if (pair.isPresent()) {
            list.remove(pair.get());
        }
    }

    class Pair {

        int key;
        int value;

        public Pair(int key, int value) {
            this.key = key;
            this.value = value;
        }
    }

    public static void main(String[] args) {
        var myHashMap = new DesignHashMap();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
        assertEquals(1, myHashMap.get(1));    // return 1, The map is now [[1,1], [2,2]]
        assertEquals(-1, myHashMap.get(3));    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        assertEquals(1, myHashMap.get(2));    // return 1, The map is now [[1,1], [2,1]]
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        assertEquals(-1, myHashMap.get(2));    // return -1 (i.e., not found), The map is now [[1,1]]
    }
}
