package io.zipcoder.polymorphism;

public class Dog extends Pet {
    public Dog(){
        super();
    }

    public Dog(String name ){
        super(name);
    }
    public String speak() {
        System.out.println("Woof");
        return "Woof";
    }
}
