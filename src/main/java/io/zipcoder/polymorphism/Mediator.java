package io.zipcoder.polymorphism;

public class Mediator {
    InputHandler user;
    public void run(){
        user = new InputHandler();
        user.assignNamesAndTypes();
        System.out.println(String.format("You have %d pets.\nYou have: ", user.getNumberOfPets()));
        for (int i = 0; i < user.getNumberOfPets(); i++) {
            System.out.println("\ta "+user.getPetTypes()[i]+" named "+user.getPetNames()[i]+".");
        }
    }
}
