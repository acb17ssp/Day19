package com.company;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome Employee" + "\n");

        // Constants
        int IS_FULL_TIME = 1;
        int IS_PART_TIME = 2;
        int EMP_RATE = 20;

        // Variables
        int empHours = 0;
        int salary = 0;

        // random numbers (0,1,2)
        int randomNum = (int) (Math.random() * 2 + 1);

        // selection statement
        if (randomNum == IS_FULL_TIME) {
            System.out.println("Full time - Present");
            empHours = 8;
        } else if (randomNum == IS_PART_TIME) {
            System.out.println("Part time - Present");
            empHours = 4;
        } else {
            System.out.println("Employee is Absent");
        }

        salary = EMP_RATE * empHours;
        System.out.println("Employee salary: " + salary);
    }
}
