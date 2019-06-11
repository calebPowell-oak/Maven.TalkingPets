package io.zipcoder.polymorphism;

public class Parrot extends Pet {
    public Parrot(){
        super();
    }

    public Parrot(String name ){
        super(name);
    }
    public String speak() {
        return "Squaawk";
    }
}
