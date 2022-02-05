package com.company;

import java.util.Arrays;

import java.util.Random;
import java.util.Scanner;


import static java.util.Arrays.*;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Declaration Part
        Scanner sc = new Scanner(System.in);
        String stFirstName;
        //Primitive Data types Arrays
        int[] stMarks = new int[10];
        //Array of Objects
        Student[] stList = new Student[3];

        //Array of List


        for (int i = 0; i < stList.length; i++) {
            System.out.println("Enter the student # "+(i+1)+" Information : ");
            System.out.println("Enter Studnet first name : ");
            stFirstName = sc.nextLine();
            System.out.println("Enter Studnet's last name : ");
            String stLastName = sc.nextLine();
            System.out.println("Enter Studnet's W number : ");
            String stWnumber = sc.nextLine();
            System.out.println("Enter Studnet's enrollment (true/false) : ");
            boolean stIsFullTime = sc.nextBoolean();
            System.out.println("Enter Studnet's tuition fees ");
            double stTuitionFees = sc.nextDouble();
            sc.nextLine();//To handle the new line character

            //Student firstStudent = new Student(stFirstName,stLastName,stWnumber,stIsFullTime,stTuitionFees);
            stList[i] = new Student(stFirstName,stLastName,stWnumber,stIsFullTime,stTuitionFees);
            //firstStudent.reportOne();
        }
//        stList[0].reportOne();
//        stList[1].reportOne();
//        stList[2].reportOne();
        //stList[3].reportOne();
        for (int i = 0; i < stList.length; i++) {
            stList[i].reportOne();
        }







       
    }
}
