package com.company;

public abstract class Animal {
    private String name;
    protected int runLimit = Integer.MAX_VALUE;
    protected int sailLimit = Integer.MAX_VALUE;

    public Animal(String name) {
        this.name = name;
    }

    public void run(int length) {
        if (length > runLimit) {
            System.out.println("Вы указали слишком большое число(" + length + ") - " + name + " пробежал: " + runLimit + " м");
        }
        if (length < 0) {
            System.out.println("Вы указали слишком маленькое число(" + length + ") - " + name + " пробежал: 0 м");
        }
        System.out.println("пес пробежал: " + length + " м");
    }

    public void sail(int length) {
        if (length > sailLimit) {
            System.out.println("Вы указали слишком большое число(" + length + ") - " + name + " проплыл: " + sailLimit + " м");
        }
        if (length < 0) {
            System.out.println("Вы указали слишком маленькое число(" + length + ") - " + name + " проплыл: 0 м");
        }
        System.out.println("пес проплыл: " + length + " м");
    }
}