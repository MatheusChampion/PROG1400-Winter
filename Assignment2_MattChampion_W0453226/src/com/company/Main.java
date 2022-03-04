package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        //Create the scanner for input
        Scanner input = new Scanner(System.in);
        //Two arrays of Student class
        Student[] groupeOne = new Student[6];
        Student[] groupeTwo = new Student[6];
        //Array of course object
        Course[] courseList = new Course[2];

        //Course information
        String courseName;
        
        //Gathering course name
        for (int i = 0; i < courseList.length; i++) {
            System.out.println("Enter course #" + (i+1));
            courseName = input.nextLine();
            courseList[i] = new Course(courseName);
        }
        //Display 1st course name
        System.out.println("------------------------------------------");
        System.out.println("Enter students for " + courseList[0].courseName);

        // Student information
        String stName;
        double fstAss = 0;
        double sndAss = 0;
        // Loop
        boolean True;

        //first course
        for (int i = 0; i < groupeOne.length; i++) {
            System.out.println("Enter student name #" + (i+1));
            stName = input.nextLine();
            True = true;
            while (True) {
                System.out.println("Enter student 1st mark");
                fstAss = input.nextDouble();
                if (fstAss >= 0 && fstAss <= 20){
                    True = false;
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("Input invalid. Please try again");
                    System.out.println("--------------------------------");
                    input.nextLine();
                }
            }
            True = true;
            while (True) {
                System.out.println("Enter student 2nd mark");
                sndAss = input.nextDouble();
                if (sndAss >= 0 && sndAss <= 20){
                    True = false;
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("Input invalid. Please try again");
                    System.out.println("--------------------------------");
                    input.nextLine();
                }
            }
            input.nextLine();
            groupeOne[i] = new Student(stName, fstAss, sndAss);
        }

        //Display 2nd course name
        System.out.println("--------------------------------------");
        System.out.println("Enter students for " + courseList[1].courseName);


        //second course
        for (int i = 0; i < groupeTwo.length; i++) {
            System.out.println("Enter student name #" + (i+1));
            stName = input.nextLine();
            True = true;
            while (True) {
                System.out.println("Enter student 1st mark");
                fstAss = input.nextDouble();
                if (fstAss >= 0 && fstAss <= 20){
                    True = false;
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("Input invalid. Please try again");
                    System.out.println("--------------------------------");
                    input.nextLine();
                }
            }
            True = true;
            while (True) {
                System.out.println("Enter student 2nd mark");
                sndAss = input.nextDouble();
                if (sndAss >= 0 && sndAss <= 20){
                    True = false;
                } else {
                    System.out.println("--------------------------------");
                    System.out.println("Input invalid. Please try again");
                    System.out.println("--------------------------------");
                    input.nextLine();
                }
            }
            input.nextLine();
            groupeTwo[i] = new Student(stName, fstAss, sndAss);
        }
        //variable
        double tt1 = 0;
        double tt2 = 0;

        //gather total mark 1st group
        for (int i = 0; i < groupeOne.length; i++) {
            tt1 += groupeOne[i].mark1;
            tt2 += groupeOne[i].mark2;
        }
        //Pass the information
        courseList[0].total1 = tt1;
        courseList[0].total2 = tt2;
        courseList[0].totalFinal = tt1 + tt2;

        //gather total mark 1st group
        for (int i = 0; i < groupeTwo.length; i++) {
            tt1 += groupeTwo[i].mark1;
            tt2 += groupeTwo[i].mark2;
        }

        //Pass the information for 2nd course
        courseList[1].total1 = tt1;
        courseList[1].total2 = tt2;
        courseList[1].totalFinal = tt1 + tt2;

        //Report
        System.out.println("==============================================================================");
        System.out.println("REPORT: Stats per Course");
        System.out.println("===============================================================================");
        for (int i = 0; i < courseList.length; i++) {
            System.out.println(courseList[i].reportCourse());
        }
        System.out.println();
        System.out.println("==============================================================================");
        System.out.println("REPORT: Stats per Student");
        System.out.println("==============================================================================");
        System.out.println(courseList[0].courseName + ":");
        for (int i = 0; i < groupeOne.length; i++) {
            System.out.println(groupeOne[i].report());
        }
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(courseList[1].courseName + ":");
        for (int i = 0; i < groupeTwo.length; i++) {
            System.out.println(groupeTwo[i].report());
        }
        System.out.println("==============================================================================");
    }
}
