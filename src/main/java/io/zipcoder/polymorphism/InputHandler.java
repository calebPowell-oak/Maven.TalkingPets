package io.zipcoder.polymorphism;

import sun.jvm.hotspot.jdi.IntegerTypeImpl;

import java.util.Scanner;

public class InputHandler {
    private Scanner in = new Scanner(System.in);
    private Integer numberOfPets;
    private String[] petNames;
    private String[] petTypes;

    public InputHandler(){
        numberOfPets = 0;
        petNames = new String[] {};
        petTypes = new String[] {};
    }

    public void assignNamesAndTypes(){
        setNumberOfPets(getUInt("Enter the number of pets that you have: "));
        petNames = new String[numberOfPets];
        petTypes = new String[numberOfPets];
        for (int i = 0; i < numberOfPets; i++) {
            petTypes[i] = getUString(String.format("Enter type of pet no. %d: ", i + 1));
            petNames[i] = getUString("Enter the name of that " + petTypes[i] + " :");
        }
    }

    public String getUString(String prompt){
        System.out.println(prompt);
        return in.nextLine();
    }

    public Integer getUInt(String prompt){
        System.out.println(prompt);
        try {
            return Integer.parseInt(in.nextLine());
        } catch (NumberFormatException xcep){
            System.out.println("Invalid number. Use an integer.");
            return getUInt(prompt);
        }
    }

    public void setNumberOfPets(Integer numberOfPets) {
        this.numberOfPets = numberOfPets;
    }

    public Integer getNumberOfPets() {
        return numberOfPets;
    }

    public String[] getPetNames() {
        return petNames;
    }

    public String[] getPetTypes() {
        return petTypes;
    }
}
