package com.company;

public class Student {
    //1.Attributes / Properties
    // Those are encapsulated properties, becaue we used private.(Encapsulation)
    private String fName;
    private String lName;
    private String wNumber;
    private boolean isFullTime;
    private double tuitionFees;

    //2. Constructors.
    //1. The default constructor
    //2. User defined constructor with parameters
    public Student(String pFirName, String pLname,String pWnumber,boolean pIsFullTime,double pTuitionFees){
        this.fName = pFirName;
        this.lName = pLname;
        this.isFullTime = pIsFullTime;
        this.wNumber = pWnumber;
        this. tuitionFees = pTuitionFees;

    }


    //Methoids
    public void reportOne(){
        System.out.println(this.wNumber+"\t"+this.fName+"\t"
                +this.lName+"\t"+this.tuitionFees+"\t"+this.isFullTime);
    }
    public double getTuitionFees(){
        return this.tuitionFees;
    }

}
