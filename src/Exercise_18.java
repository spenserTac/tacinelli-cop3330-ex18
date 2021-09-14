/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Spenser Tacinelli
 */

import java.util.Scanner;

public class Exercise_18{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press F to convert from Celsius to Fahrenheit.");
        System.out.print("Your Choice: ");

        String input = scanner.nextLine();
        input.toLowerCase(); //Not sure if this's right, but it's supposed to convert to lowercase.

        System.out.print("Please enter the temperature in ");
        String out1 = (input.equals("c")) ? "Celsius: " : "Fahrenheit: ";
        System.out.print(out1);
        String temp_tempurature = scanner.nextLine();
        int temperature = Integer.parseInt(temp_tempurature);

        int result_temp = (input.equals("c")) ? ((temperature - 32) * (5/9)) : (((temperature * 9)/5) + 32);

        System.out.print("The temperature in ");
        String output = (input.equals("c")) ? "Fahrenheit is " + result_temp : "Celsius is " + result_temp;
        System.out.println(output);
    }
}
