package com.bridglabz;

public class EmployeeWage {
    static final int Wage_Per_Hour = 20;
    static final int Full_Time_Hour = 8;
    static final int Part_Time_Hour = 4;
    static final int Is_Part_Time_Hour = 1;
    static final int Is_Full_Time_Hour = 2;
    static final int Working_Days_Per_Month=20;
    static final int Working_Hours_Per_Month=100;
    public static void main(String[] args) {

        int day = 1;
        int totalWage = 0;
        int workingHours=0;
        while (day < Working_Days_Per_Month && workingHours<Working_Hours_Per_Month) {
            int employeeAttendance = (int) Math.floor(Math.random() * 10) % 3;
            System.out.println(employeeAttendance);
            int dailyWage=0;
            switch (employeeAttendance) {

                case Is_Full_Time_Hour:
                    System.out.println("Employee is Present");
                    dailyWage = Wage_Per_Hour * Full_Time_Hour;
                    workingHours+=Full_Time_Hour;
                    System.out.println("Employee Daily Wage Is " + dailyWage);
                    break;
                case Is_Part_Time_Hour:
                    dailyWage = Wage_Per_Hour * Part_Time_Hour;
                    workingHours+=Part_Time_Hour;
                    System.out.println("Employee is Part Time");
                    System.out.println("Employee Daily Wage Is " + dailyWage);
                    break;
                default:
                    System.out.println("Absent");
            }
            totalWage= totalWage + dailyWage;
            day++;
        }
        System.out.println("Total Wage Of Employe for Month is => "+totalWage);
        System.out.println("Total Wage Of Employe for day is => "+day);
        System.out.println("Total Working hour  for Month is => "+workingHours);
    }
}