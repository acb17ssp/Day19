package com.company;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome Employee"+"\n");

        // Constants
        int IS_FULL_TIME = 1;
        int EMP_RATE = 20;

        // Variables
        int empHours = 0;
        int salary = 0;
        double randomNum = Math.floor(Math.random() * 10) % 2;

        // Selection statement
        if (randomNum == IS_FULL_TIME){
            System.out.println("Employee Present");
            empHours = 8;
        }else{
            System.out.println("Employee Absent");
        }
        salary = EMP_RATE * empHours;
        System.out.println("Employee salary: " + salary);
    }
}
