package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String ffName;
        String ffType;;
        Food[] picnicBasket = new Food[3];

        for (int i = 0; i < picnicBasket.length; i++) {
            System.out.println("Enter the food name :");
            ffName = input.nextLine();
            System.out.println("Enter the food type :");
            ffType = input.nextLine();

            picnicBasket[i]  = new Food(ffName, ffType);

            switch (picnicBasket[i].foodType) {
                case("vegetable"):
                    picnicBasket[i].denylt();
                    break;
                case("meat"):
                    picnicBasket[i].eatlt();
                    break;
                case("fruit"):
                    picnicBasket[i].denylt();
                    break;
                default:
                    System.out.println("I don't know this type of food");
            }
        }
    }
}
