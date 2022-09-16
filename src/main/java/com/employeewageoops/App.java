package com.employeewageoops;

class Employee {
    int isAbsent;
    int wagePerHour = 20;
    int partTimeOrFullTime;
    int salary;
    int maxWorkingHours = 100;
    int maxWorkingDays = 20;

    Employee() {
        isAbsent = (int) Math.round(Math.random()); // if isAbsent = 1 employee is absent else present
        if (isAbsent == 0) {
            partTimeOrFullTime = ((Math.random() <= 0.5) ? 1 : 2) * 2; // check if employee is part time or full time
        }
    }

    void isAbsentPresent() { // To check if employee is present or absent for the day
        if (isAbsent == 0) {
            System.out.println("Employee is Present for the day");
        } else {
            System.out.println("Employee is Absent for the day");
        }
    }

    int employeeDailyWage() { // To calculate daily wage of the employee for the
        switch (isAbsent) { // switch on the basis of isAbsent i.e Employee is present or not
            case 1:
                salary = 0; // Employee is absent
                break;
            case 0: // Employee is present
                if (partTimeOrFullTime == 1) {
                    salary = 4 * wagePerHour; // If partTime = 1 i.eyyy
                } else {
                    salary = 8 * wagePerHour;
                }
                break;
            default:
                System.out.println("No output!");
        }
        System.out.println("Salary for the day is : " + salary);
        return salary;
    }

    int employeeHours() {
        if (partTimeOrFullTime == 1) {
            return 4;
        } else {
            return 8;
        }
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        Employee empObject[] = new Employee[20];
        int totalSalary = 0;
        int totalHours = 0;
        for (int i = 1; i < 20; i++) {
            if (totalHours >= 100) {
                System.out.println("Maximum number of hours reached: " + totalHours);
                System.out.println("Salary total is: " + totalSalary);
                System.exit(0);
            }
            empObject[i] = new Employee();
            empObject[i].isAbsentPresent();
            totalSalary = totalSalary + empObject[i].employeeDailyWage();
            totalHours = totalHours + empObject[i].employeeHours();
        }
        System.out.println("Maximum number of days reached: 20");
        System.out.println("Salary total is :" + totalSalary);
    }

}