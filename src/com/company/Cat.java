package com.company;

public class Cat {
    private int size = 10;
    private boolean isReplete;

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (isReplete) {
            System.out.println(name + " the cat is full...");
        }
        if (size > plate.getFood()) {
            System.out.println(name + " there is not enough food in the plate...");
        } else {
            System.out.println(name + " eat...");
            plate.decreaseFood(10);
            isReplete = true;
        }
    }

    public boolean isReplete() {
        return isReplete;
    }
}
