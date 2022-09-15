package com.employeewageoops;

class Employee {
    long isAbsent;
    int wagePerHour = 20;
    int FullDay = 8;
    int salary;

    Employee() {
        isAbsent = Math.round(Math.random());
    }

    void isAbsentPresent() { // To check if employee is present or absent for the day
        if (isAbsent == 0) {
            System.out.println("Employee is Present for the day");
        } else {
            System.out.println("Employee is Absent for the day");
        }
    }

    void employeeDailyWage() { // To calculate daily wage of the employee for the day
        if (isAbsent != 0) {
            salary = 0;
        } else {
            salary = FullDay * wagePerHour;
        }
        System.out.println("Salary for the day is :" + salary);
    }
}

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        Employee empObject = new Employee();
        empObject.isAbsentPresent();
        empObject.employeeDailyWage();
    }
}
