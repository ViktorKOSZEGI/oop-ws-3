package com.codecool;

public class Cat extends Animal{

    public Cat(String name, boolean isMale) {
        super(name, isMale);
    }

    @Override
    public void speak(int repeat) {
        for (int i = 0; i < repeat; i++) {
            System.out.println("miau");
        }
    }
}
