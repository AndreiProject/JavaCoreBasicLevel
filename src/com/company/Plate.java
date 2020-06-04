package com.company;

public class Plate {
    private int food;

    public Plate(int food) {
        if (food > 0) {
            this.food = food;
        }
    }

    public int getFood() {
        return food;
    }

    public void addFood(int food) {
        if (food < 1) {
            System.out.println(" too little food...");
            return;
        }
        if (this.food + food > Integer.MAX_VALUE) {
            System.out.println(" too much food...");
            return;
        }
        this.food += food;
    }

    public void decreaseFood(int amount) {
        if (food < amount) {
            food = 0;
        } else {
            food -= amount;
        }
    }

    public void info() {
        System.out.println("Plate: " + food);
    }
}