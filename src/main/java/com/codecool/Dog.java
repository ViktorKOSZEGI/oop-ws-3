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

    @Override
    public void eat(Food myFood) throws FeedException {
        if (!(myFood.equals(Food.BONE))) {
            throw new FeedException(FeedExceptionCode.I_DONT_LIKE_MOUSE);
        }
        super.eat(myFood);
    }
}
