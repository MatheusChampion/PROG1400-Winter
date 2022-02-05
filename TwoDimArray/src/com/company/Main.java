package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        //Declare a two dimenional array
        int[][] my2DimArray = new int[2][2];// Array of 3 rows and 4 columns
        int[][] the2ndArray = {{10,20,30,40}, //First Row
                                {12,15,18,19},//2nd Row
                                {10,10,10,10} //3rd Row
                                };
        //int sum1 = 10+20+30+11; //XXX
        //int sum2 = the2ndArray[0][0] + the2ndArray[0][1] + the2ndArray[0][2] + the2ndArray[0][3];
        System.out.println(the2ndArray.length);
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {

                System.out.print(the2ndArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Enter my2DimArray's elements : ");
        for (int i = 0; i < my2DimArray.length; i++) {
            for (int j = 0; j < my2DimArray[i].length; j++) {
                System.out.print("Enter the element : ");
                my2DimArray[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < my2DimArray.length; i++) {
            for (int j = 0; j < my2DimArray[i].length; j++) {
                System.out.print(my2DimArray[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(Arrays.deepToString(my2DimArray));

    }
}
