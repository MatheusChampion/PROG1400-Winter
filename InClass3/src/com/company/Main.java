package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        double houseLength;
        double houseWidth;
        String houseColour;
        int houseBedroom;
        House[] houseInformation = new House[3];

        for (int i = 0; i < houseInformation.length; i++) {
            System.out.println("Enter the house Length :");
            houseLength = input.nextDouble();
            System.out.println("Enter the house Width :");
            houseWidth = input.nextDouble();
            System.out.println("Enter the house colour :");
            input.nextLine();
            houseColour = input.nextLine();
            System.out.println("Enter how many bedroom the house have:");
            houseBedroom = input.nextInt();

            houseInformation[i] = new House(houseLength, houseWidth, houseColour, houseBedroom);

            System.out.println("This house information: ");
            houseInformation[i].printTotalArea();
            houseInformation[i].description();

        }
    }
}
