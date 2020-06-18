package com.aim.arrays;

import java.util.Scanner;

public class GetAverage {

    /**
     * Display 5 integers entered by user and their average.
     * 
     * Requirements: Use a for loop for getting the integers and store in an array
     * 
     * @param args
     */
    public static void main(String[] args) {
        // Set how many integers
        int numberOfIntegers = 5;

        Scanner input = new Scanner(System.in);
        System.out.println("Enter " + numberOfIntegers + " integer values.\r");

        // Declare an array
        int[] array = new int[numberOfIntegers];
        for(int i = 0; i < numberOfIntegers; i++) {
        array[i] = input.nextInt();
        }
        input.close();

        // Print all integer values entered by user
        for(int i = 0; i < array.length; i++){
            System.out.println("Array element " + i + " is " + array[i]);
        }

        // Get average of all integers
        int sum = 0;
        for(int i = 0; i < array.length; i++){
            sum += array[i];
        }

        // Print out sum and average
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + sum/numberOfIntegers);

        System.out.println("\n");
    }

}