package com.company;

public class Animal {
    // Properties
    private String species;
    private double max_weight;
    private String habitat;
    private boolean endangered;

    //Default Constructor
    public Animal () {
        this.setSpecies("Tiger");
        this.setMax_weight(79.4);
        this.setHabitat("Zoo");
        this.setEndangered(false);
    }
    //Parametrized constructor
    public Animal (String wspecies, double wmax_weight, String whabitat, boolean wendangered){
        this.setSpecies(wspecies);
        this.setMax_weight(wmax_weight);
        this.setHabitat(whabitat);
        this.setEndangered(wendangered);
    }

    // Methods
    public void feed(){
        System.out.println("Animal can eat. Feed the "+ this.getSpecies() + " Meat");
    }
    public void sound(){
        System.out.println("The " + this.getSpecies() + " can 'bark'");
    }
    public void report(){
        System.out.println("The " + this.getSpecies() + " has " + this.getMax_weight() + "kg and lives on " + this.getHabitat() + "and this animal is in Endangered");
    }

    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public double getMax_weight() {
        return max_weight;
    }

    public void setMax_weight(double max_weight) {
        this.max_weight = max_weight;
    }

    public String getHabitat() {
        return habitat;
    }

    public void setHabitat(String habitat) {
        this.habitat = habitat;
    }

    public boolean isEndangered() {
        return endangered;
    }

    public void setEndangered(boolean endangered) {
        this.endangered = endangered;
    }
