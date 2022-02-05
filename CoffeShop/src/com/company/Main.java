package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Constants Variables (Initializing our variables)
        double priceOfCoffee = 1.25;
        double taxRate = 1.15;
        double priceOfCake = 3.25;

        System.out.println("Welcome to the Coffee Shop!"); // println = print and move to the new line
        System.out.print("Enter the number of cups: ");
        // Gathering Data from user
        // Create a new Scanner Object
        Scanner scannerName = new Scanner(System.in); //I am creating a new Scanner Object
        // called scannerName from Scanner class

        // Declaring the required variables
        int numOfCups = scannerName.nextInt(); // numOfCups is the first variable
        System.out.print("Enter the number of Cakes: ");
        int numOfCakes = scannerName.nextInt();
        System.out.print("Enter the customer name: ");
        scannerName.nextLine();// To handle the previous new line
        String CustName = scannerName.nextLine();

         //System.out.println("Number of Cups is : " + numOfCups);
        // Calculating the total order
        // calculating the pre tax total
//        double preTaxTotal = numOfCups * 1.25;

        double preTaxTotal = numOfCups*priceOfCoffee + numOfCakes*priceOfCake;
        System.out.println("Your pretax total is $" + preTaxTotal);
        double finalTotal = preTaxTotal * taxRate;
        System.out.printf("Your final total is $%.2f\n",finalTotal);
        System.out.println("Thank you "+CustName+ " \nVisit us again!!");



    }
}
