package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class Mediator {
    InputHandler user;
    ArrayList<Pet> pets;
    public void run(){
        user = new InputHandler();
        user.assignNamesAndTypes();
        pets = new ArrayList<Pet>(user.getNumberOfPets());
        for (int i = 0; i < pets.size(); i++) {
            pets.add(petFromString(user.getPetTypes().get(i),user.getPetNames().get(i)));
        }
    }

    public Pet petFromString(String type, String name){
        switch(type){
            case "dog":{
                return new Dog(name);
            }
            case "cat":{
                return new Cat(name);
            }
            case "parrot":{
                return new Parrot(name);
            }
            default:
                return null;
        }
    }

    public ArrayList<Pet> getPets(){
        return pets;
    }
}