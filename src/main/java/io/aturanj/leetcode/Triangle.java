package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/triangle/
 */
public class Triangle {

    List<Integer> mainList = new ArrayList<>();
    List<List<Integer>> triangle = null;

    public int minimumTotal(List<List<Integer>> triangle) {

        this.triangle = triangle;
        calculate(0, 0, new ArrayList<>());

        return Collections.min(mainList);
    }

    private void calculate(int row, int index, List<Integer> list) {

        if (row == triangle.size()) {
            return;
        }

        list.add(triangle.get(row).get(index));

        if (row == triangle.size() - 1) {
            mainList.add(list.stream().reduce(0, (a, b) -> a + b));
        }

        calculate(row + 1, index, list.stream().collect(Collectors.toList())); //pass a new cloned list
        calculate(row + 1, index + 1, list.stream().collect(Collectors.toList())); //pass a new cloned list
    }

    public static void main(String[] args) {
        var triangle = new Triangle();
        var triangleList = new ArrayList<List<Integer>>();
        triangleList.add(Arrays.asList(2));
        triangleList.add(Arrays.asList(3, 4));
        triangleList.add(Arrays.asList(6, 5, 7));
        triangleList.add(Arrays.asList(4, 1, 8, 3));
        var result = triangle.minimumTotal(triangleList);
        System.out.println("result = " + result);
        assertEquals(11, result);
    }
}
