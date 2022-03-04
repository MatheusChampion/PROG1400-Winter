package com.company;

public class House {

    public double length;
    public double width;
    public String colour;
    public int bedroom;

    public House (double wlength, double wwidth, String wcolour, int wbedroom) {
        this.length = wlength;
        this.width = wwidth;
        this.colour = wcolour;
        this.bedroom = wbedroom;
    }

    public void printTotalArea(){
        System.out.println("The square footage of the house is " + (this.width * this.length) + "ft^2");
    }

    public void description() {
        System.out.print("This house have " + this.bedroom + " bedrooms and the house colour is " + this.colour + "\n");
    }
}
