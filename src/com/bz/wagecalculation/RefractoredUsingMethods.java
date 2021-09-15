package com.bz.wagecalculation;
import java.util.*;
public class RefractoredUsingMethods {
    void CalculateMonthlyWageBasedOnTotalDaysOrTotalHours(int userInput , int workingDays , int hoursPerMonth){
        int wagePerHour = 20;
        int hoursPerDay = 8;
        if ((userInput == 1) & (workingDays <= 20))
            System.out.println("The Monthly Wage of Employee based on total working days=" + wagePerHour * hoursPerDay * workingDays + " Rs");
        else if ((userInput == 2) & (hoursPerMonth <= 100))
            System.out.println("The Monthly Wage of Employee based on total working hours=" + wagePerHour * hoursPerMonth + " Rs");
        else
            System.out.println("Invalid Input from User");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for computing in days\nEnter 2 for computing in hour");
        int userInput = sc.nextInt();
        System.out.println("Enter total number of working days");
        int workingDays = sc.nextInt();
        System.out.println("Enter total number of working hours");
        int hoursPerMonth = sc.nextInt();
        RefractoredUsingMethods wage = new RefractoredUsingMethods();
        wage.CalculateMonthlyWageBasedOnTotalDaysOrTotalHours(userInput , workingDays , hoursPerMonth);
        }
    }

