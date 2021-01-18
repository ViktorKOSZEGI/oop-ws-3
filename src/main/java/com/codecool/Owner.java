package com.codecool;

import java.util.List;

public class Owner {
//    Create the constructor(List<Animal> animals)
//    Create a feed method which calls all the animal-s feed() method
    private List<Animal> animals;

    public Owner(List<Animal> animals) {
        this.animals = animals;
    }

    public void feed() throws FeedException {
        for (Animal myAnimal: animals) {
            if (myAnimal instanceof Dog) {
                myAnimal.eat(Food.BONE);
            }
            else {
                myAnimal.eat(Food.BONE);
            }
        }
    }
}
