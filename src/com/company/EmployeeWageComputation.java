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
        int totalWage = 0;

        // for loop
        for (int i=1; i<=5; i++){

            // random numbers (0,1,2)
            int randomNum = (int)( Math.random() * 2 + 1);

            // selection statement
            if (randomNum == IS_FULL_TIME){
                System.out.println("Full time - Present");
                empHours = 8;
            }
            else if (randomNum == IS_PART_TIME){
                System.out.println("Part time - Present");
                empHours = 4;
            }
            else{
                System.out.println("Employee is Absent" + '\n');
            }

            // calculation of salary
            salary = EMP_RATE * empHours;
            System.out.println("Employee salary for a day: " + salary + '\n');
            totalWage+=salary;
        }
        System.out.println("Total salary: " + totalWage);
    }
}
