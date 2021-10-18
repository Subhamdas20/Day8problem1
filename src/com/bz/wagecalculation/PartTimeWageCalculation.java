package com.bz.wagecalculation;

public class PartTimeWageCalculation {
    public static void main(String[] args) {
        int wagePerHour = 20;
        int hoursPerDay = 8;
        int hoursPartTime = hoursPerDay/2;
        System.out.println("The Daily Wage of Employee = " + wagePerHour*hoursPerDay + " Rs");
        System.out.println("The Daily Wage of Part Time Employee = " + wagePerHour*hoursPartTime + " Rs");
    }
}
