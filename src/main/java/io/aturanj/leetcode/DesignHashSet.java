package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/design-hashset/
 */
public class DesignHashSet {

    List list;

    public DesignHashSet() {
        list = new ArrayList<Integer>();
    }

    public void add(int key) {
        if (!list.contains(key)) {
            list.add(key);
        }
    }

    public void remove(int key) {
        list.remove(new Integer(key));
    }

    public boolean contains(int key) {
        return list.contains(key);
    }

    public static void main(String[] args) {
        var myHashSet = new DesignHashSet();
        myHashSet.add(1);      // set = [1]
        myHashSet.add(2);      // set = [1, 2]
        assertTrue(myHashSet.contains(1)); // return True
        assertFalse(myHashSet.contains(3)); // return False, (not found)
        myHashSet.add(2);      // set = [1, 2]
        assertTrue(myHashSet.contains(2)); // return True
        myHashSet.remove(2);   // set = [1]
        assertFalse(myHashSet.contains(2)); // return False, (already removed)
    }
}
