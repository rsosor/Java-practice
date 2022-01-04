package com.rsosor.javase.generics;

public class Cat<T> extends Animal<T> {

    private String litterPreference;

    public Cat(String name) {
        super(name);
    }

    public Cat() {}

    public String getLitterPreference() {
        return litterPreference;
    }

    public void setLitterPreference(String litterPreference) {
        try {
            this.litterPreference = litterPreference;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void meow() {
        System.out.println(this.name + ": meow");
    }
}

