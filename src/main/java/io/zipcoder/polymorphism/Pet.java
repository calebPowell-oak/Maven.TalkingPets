package io.zipcoder.polymorphism;

public abstract class Pet {
    private String name;

    public abstract void speak();

    public Pet(String name) {
        this.name = name;
    }

    public Pet() {
        this("no name set");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
