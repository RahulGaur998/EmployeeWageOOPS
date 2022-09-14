package com.employeewageoops;

class Employee {
    long isAbsent;

    Employee() {
        isAbsent = Math.round(Math.random());
    }

    void isAbsentPresent() {
        if (isAbsent == 0) {
            System.out.println("Employee is Present for the day");
        } else {
            System.out.println("Employee is Absent for the day");
        }
    }

}

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Computation");
        Employee empObject = new Employee();
        empObject.isAbsentPresent();
    }
}
