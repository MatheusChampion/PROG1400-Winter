package com.company;

public class Food {

    public String foodName;
    public String foodType;

    public Food (String wfoodName, String wfoodType) {
        this.foodName = wfoodName;
        this.foodType = wfoodType;
    }

    public void eatlt(){
        System.out.println("You just ate the " + this.foodName);
    }
    public void denylt(){
        System.out.println("Not eating that! I hate " + this.foodType);
    }


}
