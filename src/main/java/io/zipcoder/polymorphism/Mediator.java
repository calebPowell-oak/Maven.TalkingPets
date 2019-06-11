package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class Mediator {
    InputHandler user;
    ArrayList<Pet> pets;

    public void run(){
        user = new InputHandler();
        user.assignNamesAndTypes();
        pets = new ArrayList<>(user.getNumberOfPets());
        for (int i = 0; i < user.getNumberOfPets(); i++) {
            pets.add(petFromString(user.getPetTypes().get(i),user.getPetNames().get(i)));
        }
        output();
    }

    public void output(){
        for(Pet x : pets){
            System.out.println(x.getName() + " says: " + x.speak());
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