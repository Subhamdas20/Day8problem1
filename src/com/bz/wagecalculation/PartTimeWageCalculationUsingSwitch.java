package com.bz.wagecalculation;
import java.util.*;
public class PartTimeWageCalculationUsingSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 for Full Time Wage Calculation\nEnter 2 for Part Time Wage Calculation");
        int userInput = sc.nextInt();
        int wagePerHour = 20;
        int hoursPerDay = 8;
        int hoursPartTime = hoursPerDay/2;
        switch(userInput)
        {
            case 1:System.out.println("The Daily Wage of Employee = " + wagePerHour * hoursPerDay + " Rs");
                break;
            case 2 :System.out.println("The Daily Wage of Part Time Employee = " + wagePerHour * hoursPartTime + " Rs");
                break;
            default : System.out.println("Invalid Input From user");
        }
    }
}
