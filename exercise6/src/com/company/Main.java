package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner input = new Scanner(System.in);
        String spec;
        double weight;
        String habitat;
        boolean endangered;
        Animal[] zoo = new Animal[3];

        for (int i = 0; i < zoo.length; i++) {
            System.out.println("Enter the animal specie :");
            spec = input.nextLine();
            System.out.println("Enter the animal weight :");
            weight = input.nextDouble();
            System.out.println("Enter animal habitat");
            input.nextLine();
            habitat = input.nextLine();
            System.out.println("Is the animal in dangerous? (true/false)");
            endangered = input.nextBoolean();
            input.nextLine();

            zoo[i]  = new Animal(spec, weight, habitat, endangered);

            if (zoo[i].isEndangered()) {
                zoo[i].report();
            } else if (zoo[i].getSpecies() == "lyon") {
                zoo[i].feed();
            } else if (zoo[i].getSpecies() == "dog"){
                zoo[i].sound();
            }

        }
    }
}
