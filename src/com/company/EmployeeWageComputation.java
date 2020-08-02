package com.company;

public class EmployeeWageComputation {

    public static void main(String[] args) {
        System.out.println("Welcome Employee"+"\n");

        // Constant
        int IS_FULL_TIME = 1;

        // Variable
        double randomNum = Math.floor(Math.random() * 10) % 2;

        // Selection statement
        if (randomNum == IS_FULL_TIME){
            System.out.println("Employee Present");
        }else{
            System.out.println("Employee Absent");
        }
    }
}
