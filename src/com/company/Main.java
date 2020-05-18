package com.company;

public class Main {

    public static void main(String[] args) {}

    // 1. Задать целочисленный массив, состоящий из элементов 0 и 1. С помощью цикла и условия заменить 0 на 1, 1 на 0;
    public static int[] getExercise1() {
        int[] array = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        for (int i = 0; i < array.length; i++) {
            switch (array[i]) {
                case 0:
                    array[i] = 1;
                    break;
                case 1:
                    array[i] = 0;
                    break;
            }
        }
        return array;
    }

    // 2. Задать пустой целочисленный массив размером 8. С помощью цикла заполнить его значениями 0 3 6 9 12 15 18 21
    public static int[] getExercise2() {
        int[] array = new int[8];
        for (int i = 0; i < array.length; i++) {
            array[i] = i * 3;
        }
        return array;
    }

    // 3. Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6 умножить на 2;
    public static int[] getExercise3() {
        int[] array = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) array[i] = array[i] * 2;
        }
        return array;
    }

    // 4. Создать квадратный двумерный целочисленный массив (количество строк и столбцов одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами;
    public static int[][] getExercise4() {
        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
        }
        return array;
    }

    // 5.  Задать одномерный массив и найти в нем минимальный и максимальный элементы (без помощи интернета);
    public static void getExercise5() {
        int[] array = {1, 4, 2, 5, 6, 17, 3, 2, 9, 3, 0};
        int max = array[0];
        int min = array[0];
        for (int value : array) {
            if (value > max) max = value;
            if (value < min) min = value;
        }
        System.out.println("max: " + max + ", min: " + min);
    }

    // 6.  Написать метод, в который передается не пустой одномерный целочисленный массив, метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны.
    public static boolean getExercise6(int[] array) {
        int sum = 0;
        int leftSum = 0;
        int rightSum = 0;

        for (int num : array) {
            sum += num;
        }
        if (sum % 2 != 0 && array.length < 2) return false;

        for (int value : array) {
            if (leftSum < sum / 2) {
                leftSum += value;
            } else {
                rightSum += value;
            }
        }
        return leftSum == rightSum;
    }


    //----------------------------------------
    // 7. **** Написать метод, которому на вход подается одномерный массив и число n (может быть положительным, или отрицательным), при этом метод должен сместить все элементымассива на n позиций. Для усложнения задачи нельзя пользоваться вспомогательными массивами.
    public static int[] getExercise7(int[] array, int n) {
        boolean isPositive = n > 0;
        n = Math.abs(n);

        if (array.length < 2) return array;
        if (array.length < n) n = n % array.length;
        if (isPositive) {
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < array.length - 1; j++) {
                    int num = array[j + 1];
                    array[j + 1] = array[0];
                    array[0] = num;
                }
            }
        } else {
            for (int i = 0; i < n; i++) {
                for (int j = array.length - 1; j > 0; j--) {
                    int num = array[j - 1];
                    array[j - 1] = array[array.length - 1];
                    array[array.length - 1] = num;
                }
            }
        }
        return array;
    }
}