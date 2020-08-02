package com.company;

public class EmployeeWageComputation {

    // Constants
    public static final int IS_FULL_TIME = 1;
    public static final int IS_PART_TIME = 2;
    public static final int EMP_RATE = 20;

    public static void main(String[] args) {
        System.out.println("Welcome Employee" + "\n");

        // Variables
        int empHours = 0;
        int salary = 0;

        // random numbers (0,1,2)
        int randomNum = (int)( Math.random() * 2 + 1);

        // Using Switch case
        switch(randomNum){
            case IS_FULL_TIME:
                System.out.println("Full time Employee");
                empHours = 8;
                break;
            case IS_PART_TIME:
                System.out.println("Part time Employee");
                empHours = 4;
                break;
            default:
                System.out.println("Absent");
        }

        salary = EMP_RATE * empHours;
        System.out.println("Employee salary: " + salary);
    }
}
