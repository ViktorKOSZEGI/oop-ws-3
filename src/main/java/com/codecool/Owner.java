package com.codecool;

import java.util.List;

public class Owner {
//    Create the constructor(List<Animal> animals)
//    Create a feed method which calls all the animal-s feed() method
    private List<Animal> animals;

    public Owner(List<Animal> animals) {
        this.animals = animals;
    }

    public void feed() {
        for (Animal myAnimal: animals) {
            myAnimal.feed();
        }
    }
}
