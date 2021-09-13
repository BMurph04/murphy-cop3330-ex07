/*
 * UCF COP3330 Fall 2021 Assignment 1 Solution
 * Copyright 2021 Brendon Murphy
 */
package org.example;
import java.util.Scanner;


public class App 
{
    public static void main( String[] args )
    {
        //input
        Scanner input = new Scanner(System.in);

        System.out.println("What is the length of the room in feet?");
        double feetLength = input.nextDouble();
        System.out.println("What is the width of the room in feet?");
        double feetWidth = input.nextDouble();

        //constants and conversions
        double feetToMeters = 0.09290304;

        double feetArea = feetLength * feetWidth;
        double metersArea = feetArea * feetToMeters;



        //output
        System.out.println(String.format("You entered dimensions of %.3f feet by %.3f feet.", feetLength, feetWidth));
        System.out.println("The area is");
        System.out.println(String.format("%.3f square feet", feetArea));
        System.out.println(String.format("%.3f square meters", metersArea));
    }
}
