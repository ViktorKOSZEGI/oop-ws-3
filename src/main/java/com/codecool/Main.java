package com.codecool;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Animal> animals = new ArrayList<>();
//        animals.add(new Cat("Cirmi", false));
//        animals.add(new Dog("Morzsa", true));
//        OAW:
        List<Animal> animals = new ArrayList<>(Arrays.asList(
                new Cat("Cirmi", false),
                new Dog("Morzsa", true)));
        Owner myOwner = new Owner(animals);
        try {
            myOwner.feed();
        } catch (FeedException e) {
            e.printStackTrace();
        }
    }
}
