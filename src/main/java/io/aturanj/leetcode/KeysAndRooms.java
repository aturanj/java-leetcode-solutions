package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/keys-and-rooms/
 */
public class KeysAndRooms {

    List<Integer> openedRoomList = new ArrayList<>();

    public boolean canVisitAllRooms(List<List<Integer>> rooms) {

        checkKeysAndRooms(rooms, 0);

        return openedRoomList.size() == rooms.size();
    }

    private void checkKeysAndRooms(List<List<Integer>> rooms, int room) {

        openedRoomList.add(room);

        for (var key : rooms.get(room)) {
            if (!openedRoomList.contains(key)) {
                checkKeysAndRooms(rooms, key);
            }
        }
    }

    public static void main(String[] args) {

        KeysAndRooms keysAndRooms = new KeysAndRooms();

        List<List<Integer>> rooms = new ArrayList<>();
        rooms.add(Arrays.asList(1));
        rooms.add(Arrays.asList(2));
        rooms.add(Arrays.asList(3));
        rooms.add(Arrays.asList());

        var result = keysAndRooms.canVisitAllRooms(rooms);

        System.out.println("result = " + result);
    }
}
