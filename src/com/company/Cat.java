package com.company;

public class Cat extends Animal {
    public Cat(String name) {
        super(name);
        runLimit = 200;
    }

    @Override
    public void sail(int length) {
        System.out.println("увы, кот не умеет плавать");
    }
}
