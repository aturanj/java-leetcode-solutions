package io.aturanj.leetcode;

import java.util.HashSet;
import static org.junit.jupiter.api.Assertions.assertTrue;

/**
 * https://leetcode.com/problems/path-crossing/
 */
public class PathCrossing {

    public boolean isPathCrossing(String path) {

        var x = 0;
        var y = 0;
        var set = new HashSet<String>();
        set.add(x + "#" + y);

        for (var ch : path.toCharArray()) {

            switch (ch) {
                case 'N' ->
                    y++;
                case 'S' ->
                    y--;
                case 'E' ->
                    x++;
                case 'W' ->
                    x--;
            }

            if (!set.add(x + "#" + y)) {
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        var pathCrossing = new PathCrossing();
        var result = pathCrossing.isPathCrossing("NESWW");
        System.out.println("result = " + result);
        assertTrue(result);
    }
}
