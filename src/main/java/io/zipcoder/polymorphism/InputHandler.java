package io.zipcoder.polymorphism;

import java.util.ArrayList;
import java.util.Scanner;

public class InputHandler {
    private Scanner in = new Scanner(System.in);
    private Integer numberOfPets;
    private ArrayList<String> petNames;
    private ArrayList<String> petTypes;

    public InputHandler(){
        numberOfPets = 0;
        petNames = new ArrayList<String>(0);
        petTypes = new ArrayList<String>(0);
    }

    public void assignNamesAndTypes(){
        setNumberOfPets(getUInt("Enter the number of pets that you have: "));
        for (int i = 0; i < numberOfPets; i++) {
            petTypes.add(getUString(String.format("Enter type of pet no. %d: ", i + 1)));
            petNames.add(getUString("Enter the name of that " + petTypes.get(i) + " :"));
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

    public ArrayList<String> getPetNames() {
        return petNames;
    }

    public ArrayList<String> getPetTypes() {
        return petTypes;
    }
}
