package io.aturanj.leetcode;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * https://leetcode.com/problems/employee-importance/
 */
public class EmployeeImportance {

    private final Set visitedSet = new HashSet();
    private int sum;

    public int getImportance(List<Employee> employees, int id) {

        var employee = employees.stream().filter(x -> x.id == id).findAny().get();

        if (employee != null) {

            if (!visitedSet.contains(employee.id)) {
                sum += employee.importance;
                visitedSet.add(employee.id);
            }

            employee.subordinates.forEach(item -> {
                getImportance(employees, item);
            });
        }

        return sum;
    }

    /**
     * Definition for Employee.
     */
    class Employee {

        public int id;
        public int importance;
        public List<Integer> subordinates;
    }
}
