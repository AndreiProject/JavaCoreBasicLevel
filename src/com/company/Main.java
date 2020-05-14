package com.company;

public class Main {

    public static void main(String[] args) {

        // 2) --
        byte bit8 = 10;
        short bit16 = 10;
        int bit32 = 10;
        long bit64 = 10L;

        double b32 = 10.0;
        float b64 = 10F;

        boolean b = false;

        char b16 = 10;
        //----------

    }

    // 3)
    public static int calculation(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    // 4)
    private static boolean checkRangeSum(int a, int b) {
        int sum = a + b;
        return 10 <= sum && sum <= 20;
    }

    // 5)
    private static void checkNum(int a) {
        if (a >= 0) {
            System.out.println(a + " : положительное число");
        } else {
            System.out.println(a + " : отрицательное число");
        }
    }

    // 6)
    private static boolean isMinusNum(int a) {
        return a < 0;
    }

    // 7)
    private static void printName(String name) {
        System.out.println("Привет, " + name);
    }
}