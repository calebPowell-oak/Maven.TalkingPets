package io.zipcoder.polymorphism;

public class Parrot extends Pet {
    public Parrot(){
        super();
    }

    public Parrot(String name ){
        super(name);
    }
    public String speak() {
        System.out.println("Squaawk");
        return "Squaawk";
    }
}
