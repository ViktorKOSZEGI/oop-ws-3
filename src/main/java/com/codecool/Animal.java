package com.codecool;

public abstract class Animal {
    private String name;
    private boolean isMale;

    public Animal(String name, boolean isMale) {
        this.name = name;
        this.isMale = isMale;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void feed() {
        System.out.println("Nyam-nyammm!");
        speak(5);
    }

    public abstract void speak(int repeat);

}
