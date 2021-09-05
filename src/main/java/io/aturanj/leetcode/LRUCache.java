package io.aturanj.leetcode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/lru-cache/
 */
public class LRUCache {

    Map<Integer, Integer> map;
    Deque<Integer> queue;
    int capacity = 0;

    public LRUCache(int capacity) {
        map = new HashMap<>();
        queue = new ArrayDeque<>();
        this.capacity = capacity;
    }

    public int get(int key) {

        if (map.containsKey(key)) {
            queue.remove(key);
            queue.addFirst(key);
            return map.get(key);
        }

        return -1;
    }

    public void put(int key, int value) {
        if (!map.containsKey(key) && map.size() == this.capacity) {
            var last = queue.removeLast();
            map.remove(last);
        }

        queue.remove(key);
        queue.addFirst(key);
        map.put(key, value);
    }

    public static void main(String[] args) {
        var lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        System.out.println(lRUCache.get(1));    // return 1
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        System.out.println(lRUCache.get(2));    // returns -1 (not found)
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        System.out.println(lRUCache.get(1));    // return -1 (not found)
        System.out.println(lRUCache.get(3));    // return 3
        System.out.println(lRUCache.get(4));    // return 4
    }
}
