package com.company;

public class Course {
    public String courseName;
    public double total1;
    public double total2;
    public double totalFinal;

    //Constructor
    public Course (String cname){
        this.courseName = cname;
    }
    public String reportCourse(){
        return String.format("%s : \tAssignment1 - %.2f\t Assignment2 - %.2f\t Total - %.2f", this.courseName, this.total1, this.total2, this.totalFinal);
    }


}
