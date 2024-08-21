package org.example;

import java.util.*;
import java.util.stream.Collectors;

public class GroupByMaxSalary {

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

        @Override
        public String toString() {
            return name + ": " + salary;
        }
    }


        public static void main(String[] args) {
            List<Employee> employees = Arrays.asList(
                    new Employee("Alice", "HR", 50000),
                    new Employee("Emily", "HR", 65000),
                    new Employee("Bob", "Engineering", 65000),
                    new Employee("Charlie", "HR", 60000),
                    new Employee("David", "Engineering", 80000),
                    new Employee("Donna", "HealthCare", 95000),
                    new Employee("Ross", "HealthCare", 150000),
                    new Employee("Mike", "Management", 65000),
                    new Employee("Daniel", "Marketing", 92000),
                    new Employee("Eve", "Management", 100000)
            );
            //highest salary by depart
            Map<String, Optional<Employee>> highestPaidByDept = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,
                            Collectors.maxBy(Comparator.comparingDouble(Employee::getSalary))));
            highestPaidByDept.forEach((dept, emp) ->
                            System.out.println("Department: " + dept + ", Highest Paid: " + emp.orElse(null)));

            // getting average salary by dep
            Map<String, Double> avgSalaryByDept = employees.stream()
                    .collect(Collectors.groupingBy(Employee::getDepartment,Collectors.averagingDouble(Employee::getSalary)));
            System.out.println("\nAverage salary by department: " + avgSalaryByDept);

            //counting the no.of employees by depart
            Map<String,Long> employeeCount = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
            System.out.println("\nNo.of Employees per depart: " + employeeCount);

            //employees by depart
            Map<String, List<Employee>> employyesByDepart = employees.stream().collect(Collectors.groupingBy(Employee::getDepartment));
            System.out.println("\nEmployees by department:\n" + employyesByDepart);

            //sorting using threshold
            List<Employee> employeeSalaryByThreshold = employees.stream().filter(e -> e.getSalary()>80000).collect(Collectors.toList());
            System.out.println("\nEmployees salary more than 80000: " + employeeSalaryByThreshold);

            //employees with same salary
            List<Employee> employeeBySameSalary = employees.stream().collect(Collectors.groupingBy(Employee::getSalary)).values().stream().filter(list ->list.size()>1).flatMap(List::stream).collect(Collectors.toList());
             System.out.println("\nEmployees with same salary: " + employeeBySameSalary);

             //count of employees more than threshold
            long employeesCountByThreshold = employees.stream().filter(e -> e.getSalary()>80000).count();
            System.out.println("\nEmployees count of the salary more than 80000: " + employeesCountByThreshold);


        }
    }


