package com.bridglabz;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Welcome to Employee Wage Compitation Programme ");
            int employeeAttendance=(int)Math.round(Math.random());
            System.out.println(employeeAttendance);
            if (employeeAttendance==1){
                System.out.println("Employee is Present");
            }
            else {
                System.out.println("Employee is absent");
        }
    }
}
