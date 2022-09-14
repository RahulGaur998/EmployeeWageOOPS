package com.employeewageoops;

class Emp {
    long isAbsent;

    Emp() {
        isAbsent = Math.round(Math.random());
    }

    void isAbsentPresent() {
        if (isAbsent == 0) {
            System.out.println("Present");
        } else {
            System.out.println("Absent");
        }
    }

}

public class App {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Emp p = new Emp();
        p.isAbsentPresent();
    }
}
