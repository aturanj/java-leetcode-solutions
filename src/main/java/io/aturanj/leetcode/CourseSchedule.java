package io.aturanj.leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertFalse;

/**
 * https://leetcode.com/problems/course-schedule/
 */
public class CourseSchedule {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        var graph = new ArrayList<List<Integer>>();

        for (var i = 0; i < numCourses; i++) {
            graph.add(new ArrayList<>());
        }

        var incomingEdgeCount = new int[numCourses];

        for (var pair : prerequisites) {
            var course = pair[0];
            var prerequsite = pair[1];
            graph.get(prerequsite).add(course);
            incomingEdgeCount[course]++;
        }

        var queue = new LinkedList<Integer>(); //courses wiht no prerequisites

        for (var i = 0; i < numCourses; i++) {
            if (incomingEdgeCount[i] == 0) {
                queue.add(i);
            }
        }

        var countOfCoursesCanBeCompleted = 0;

        while (!queue.isEmpty()) {
            var current = queue.poll();
            countOfCoursesCanBeCompleted++;

            for (var neigbour : graph.get(current)) {
                incomingEdgeCount[neigbour]--;
                if (incomingEdgeCount[neigbour] == 0) {
                    queue.add(neigbour);
                }
            }
        }

        return countOfCoursesCanBeCompleted == numCourses;
    }

    public static void main(String[] args) {
        var courseSchedule = new CourseSchedule();
        var result = courseSchedule.canFinish(2, new int[][]{{0, 1}, {1, 0}}); //cycle exist
        assertFalse(result);
    }
}
