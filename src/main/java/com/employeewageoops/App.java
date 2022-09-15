package com.employeewageoops;

class Employee {
    long isAbsent;
    int wagePerHour = 20;
    int halfOrFullDay;
    int salary;

    Employee() {
        isAbsent = Math.round(Math.random());
        if (isAbsent == 0) {
            halfOrFullDay = ((Math.random() <= 0.5) ? 1 : 2) * 2;
        }
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
            salary = halfOrFullDay * wagePerHour;
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
