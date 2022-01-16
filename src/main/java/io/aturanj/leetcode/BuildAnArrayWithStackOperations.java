package io.aturanj.leetcode;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.stream.Collectors;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * https://leetcode.com/problems/build-an-array-with-stack-operations/
 */
public class BuildAnArrayWithStackOperations {

    public List<String> buildArray(int[] target, int n) {

        var targetList = Arrays.stream(target).boxed().collect(Collectors.toList());
        var currentList = new CopyOnWriteArrayList<Integer>();
        var resultList = new LinkedList<String>();
        var counter = 0;

        while (counter < n) {

            currentList.add(counter + 1);
            resultList.add("Push");

            if (currentList.equals(targetList)) {
                break;
            }

            currentList
                    .stream()
                    .filter(item -> !targetList.contains(item))
                    .map(item -> {
                        currentList.remove(item);
                        return item;
                    })
                    .forEachOrdered(item -> {
                        resultList.add("Pop");
                    });

            counter++;
        }

        return resultList;
    }

    public static void main(String[] args) {
        var buildAnArray = new BuildAnArrayWithStackOperations();
        var result = buildAnArray.buildArray(new int[]{1, 3}, 3);
        result.stream().forEach(x -> {
            System.out.println(x);
        });
        assertEquals(Arrays.asList("Push", "Push", "Pop", "Push"), result);
    }
}
