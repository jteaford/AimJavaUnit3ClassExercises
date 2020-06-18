package com.aim.unit2;

import java.util.Scanner;

public class Exercise2_2 {

    public static void main(String[] args) {

        // Tell the user what the program does
        // Prompts the user to enter a value for the month (1 = Jan, 2 = Feb, etc.)
        System.out.println("Given a year and a month in that year, this program will tell you");
        System.out.println("the number of days in that month.");

        // Prompt the user to enter a year
        System.out.print("Enter a year: ");

        Scanner input = new Scanner(System.in);
        int year = input.nextInt();

        // Prompt the user to enter a value for the month
        System.out.println("Enter a value for the month (1 = Jan, 2 = Feb, etc): ");
        int month = input.nextInt();

        // Close our Scanner object / InputStream
        input.close();

        int days = 0;
        String nameOfMonth = null;

        if (month == 1) {
            nameOfMonth = "January";
            days = 31;
        } else if (month == 2) {
            nameOfMonth = "February";
            boolean isLeapYear = (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
            if (isLeapYear) {
                days = 29;
            } else {
                days = 28;
            }
        } else if (month == 3) {
            nameOfMonth = "March";
            days = 31;
        } else if (month == 4) {
            nameOfMonth = "April";
            days = 30;
        } else if (month == 5) {
            nameOfMonth = "May";
            days = 31;
        } else if (month == 6) {
            nameOfMonth = "June";
            days = 30;
        } else if (month == 7) {
            nameOfMonth = "July";
            days = 31;
        } else if (month == 8) {
            nameOfMonth = "August";
            days = 31;
        } else if (month == 9) {
            nameOfMonth = "September";
            days = 30;
        } else if (month == 10) {
            nameOfMonth = "October";
            days = 31;
        } else if (month == 11) {
            nameOfMonth = "November";
            days = 30;
        } else if (month == 12) {
            nameOfMonth = "December";
            days = 31;
        }

        System.out.println(nameOfMonth + " of " + year + " has " + days + " days in it.");

    }

}