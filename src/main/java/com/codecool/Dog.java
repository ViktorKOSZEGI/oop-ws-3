package com.codecool;

public class Dog extends Animal{

    public Dog(String name, boolean isMale) {
        super(name, isMale);
    }

    @Override
    public void speak(int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println("vau");
        }
    }
}
