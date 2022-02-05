package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Create Scanner to receive input
        Scanner input = new Scanner(System.in);
//        --------------------------------------------------
//                          Part I
//        --------------------------------------------------
        System.out.println("Welcome to the First Part!");
        // Get input
        System.out.println("Enter the number of asterisks:");
        int sizeInput = input.nextInt();
        // Loop to repeat action according to number input / Decrease loop
        for ( int i = sizeInput; i > 0; i--) {
            String asterisk = "*";
            // Function repeat string 'i' number of times
            System.out.println(asterisk.repeat(i));
        }
//        --------------------------------------------------
//                          Part II
//        --------------------------------------------------
        System.out.println("-------------------------------");
        System.out.println("Welcome to the Second Part!");
        System.out.println("-------------------------------");
        System.out.println("Enter the Student Marks:");
        // Create array
        Double[] stdMark = new Double[10];
        // Variable
        double totalMark = 0;
        for (int i = 0; i < stdMark.length; i++) {
            // Get input
            System.out.println("Enter mark #" + (i + 1));
            stdMark[i] = input.nextDouble();
            // Add all the marks together
            totalMark += stdMark[i];
        }
        System.out.println("-------------------------------");
        System.out.println("         Final Report: ");
        System.out.println("-------------------------------");
        System.out.printf("The Total Marks    | %.1f\n", totalMark);
        // Finding the average of Marks
        double average = (totalMark / stdMark.length);
        System.out.printf("The Average        | %.1f\n", average);
        // sort the array of inputs in order numeric
        Arrays.sort(stdMark);
        // The first number or the smallest one in this case
        System.out.printf("The Maximum Value  | %.1f\n", stdMark[0]);
        // The last one, also the biggest one
        System.out.printf("The Minimum Value  | %.1f\n", stdMark[stdMark.length - 1]);
        System.out.println("-------------------------------");

//        --------------------------------------------------
//                          Part III
//        --------------------------------------------------
        System.out.println(" Welcome to the Third Part!");
        System.out.println("-------------------------------");
        System.out.println("The array’s elements are:");
        //Declare array
        int[][] twoDim = {{10,20,30,40}, //First Row
                {12,15,18,19},//2nd Row
                {10,10,10,10} //3rd Row
        };
        int [] oneDim = new int[12];
        // Declare variables
        int k = 0;
        int total = 0;
        // Loo  to display array
        for (int i = 0; i < twoDim.length; i++){
            for (int j = 0; j < twoDim[i].length; j++) {
                // Save into 1D array
                oneDim[k] = twoDim[i][j];
                // Add all elements together
                total += oneDim[k];
                // display row
                System.out.print(twoDim[i][j] + "\t");
                // add the counter for oneDim array
                k++;
            }
            // Skip line when hit the end of the row
            System.out.println();
        }
        //Sum 1st row
        int sum = 0;
        for (int i = 0; i < twoDim[0].length; i++) {
            sum += twoDim[0][i];
        }
        System.out.println("-------------------------------------------------");
        System.out.printf("The summation of Row #1 is : " + sum +"\n");
        //Average calculation
        int avg = (total / oneDim.length);
        System.out.println("-------------------------------------------------");
        System.out.println("The average for the entire array is : " + avg);
        System.out.println("-------------------------------------------------");
        System.out.println("The converted array's elements are:");
        // Loop for display the oneDim list created over the other loop
        for (int i = 0; i < oneDim.length; i++) {
            System.out.println(oneDim[i]);
        }

    }
}
