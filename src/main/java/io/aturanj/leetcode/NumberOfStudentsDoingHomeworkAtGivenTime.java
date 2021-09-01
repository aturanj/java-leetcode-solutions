package io.aturanj.leetcode;

/**
 *
 */
public class NumberOfStudentsDoingHomeworkAtGivenTime {

    public int busyStudent(int[] startTime, int[] endTime, int queryTime) {

        var counter = 0;

        for (var i = 0; i < startTime.length; i++) {
            if (startTime[i] <= queryTime && endTime[i] >= queryTime) {
                counter++;
            }
        }

        return counter;
    }

    public static void main(String[] args) {
        var numberOfStudents = new NumberOfStudentsDoingHomeworkAtGivenTime();
        var result = numberOfStudents.busyStudent(
                new int[]{1, 2, 3},
                new int[]{3, 2, 7},
                4);
        System.out.println("result = " + result);
    }
}
