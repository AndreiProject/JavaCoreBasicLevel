package com.company;

public class Test {
    public static void main(String[] args) {
        Plate plate = new Plate(20);

        Cat[] cats = new Cat[3];
        for (int i = 0; i < cats.length; i++) {
            cats[i] = new Cat(i + "");
            cats[i].eat(plate);
            System.out.println("cats " + cats[i].getName() + ": isReplete - " +cats[i].isReplete());
        }
    }
}