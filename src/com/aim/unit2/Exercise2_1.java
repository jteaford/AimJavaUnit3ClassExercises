package com.aim.unit2;

import java.util.Scanner;

public class Exercise2_1 {

    public static void main(String[] args) {

        // Print out what the program does
        System.out.println("\nThis program converts a temperature in degrees Celsius into a");
        System.out.println("temperature in degrees Fahrenheit. Enter a temperature in");
        System.out.println("degrees Celsius: ");

        // Get input from the user
        Scanner input = new Scanner(System.in);
        double celsius = input.nextDouble();
        input.close();

        // Convert the temperature from celsius to fahrenheit
        double fahrenheit = (9.0 / 5.0) * celsius + 32;

        // 43.50 degrees Celsius is equal to 110.30 degrees Fahrenheit.
        System.out.format("\n%5.2f degrees Celsius is equal to %5.2f degrees Fahrenheit.\n", celsius, fahrenheit);

        System.out.println("\nGoodbye ...\n");

    }

}