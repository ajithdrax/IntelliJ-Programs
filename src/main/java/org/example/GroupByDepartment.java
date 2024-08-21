package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByDepartment {
    public static void main(String[] args) {
        List<Employee> employees = Arrays.asList(
               new  Employee("Ajith","Dev",1000000),
                new Employee("Alice", "HR", 50000),
                new Employee("Bob", "Engineering", 75000),
                new Employee("Charlie", "HR", 60000),
                new Employee("David", "Engineering", 80000),
                new Employee("Eve", "Management", 100000)
        );

        Map<String, Double> avgSalaryByDept = employees.stream()
                .collect(Collectors.groupingBy(
                        Employee::getDepartment,
                        Collectors.averagingDouble(Employee::getSalary)));

        System.out.println("Average salary by department: " + avgSalaryByDept);
    }
    static class Employee {
        String name;
        String department;
        double salary;

        Employee(String name, String department, double salary) {
            this.name = name;
            this.department = department;
            this.salary = salary;
        }

        public String getDepartment() {
            return department;
        }

        public double getSalary() {
            return salary;
        }
    }


    }


