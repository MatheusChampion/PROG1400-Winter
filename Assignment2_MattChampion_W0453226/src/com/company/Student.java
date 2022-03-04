package com.company;

public class Student {
    public String name;
    public double mark1;
    public double mark2;
    public double totalMark;

    //Parametrized constructor
    public Student (String sname, double smark1, double smark2){
        this.name = sname;
        this.mark1 = smark1;
        this.mark2 = smark2;
        this.totalMark = this.mark1 + this.mark2;
    }
    //Report
    public String report(){
        return String.format("%s =>\tAssignment1 - %.2f\tAssignment2: -  %.2f\t Total - %.2f", this.name, this.mark1, this.mark2, this.totalMark);
    }
}
