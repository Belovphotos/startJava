package com.company;

import java.util.Arrays;

public class ArraysHWTwo {

    /* Создать новый массив размера 100 и заполнить его случайными числами из
диапазона от 0 до 10000.
Затем, используя циклы for each вывести:
- наибольший элемент массива
- наименьший элемент массива
- количество элементов массива, оканчивающихся на 0
- сумму элементов массива, оканчивающихся на 0
Использовать сортировку запрещено.
     */
    public static void main(String[] args) {
        int[] array = new int[100];
        fillArray(array);

        System.out.println(Arrays.toString(array));

        findMaxNumber(array);

        findMinNumber(array);

        countOfNumbersEndedByZero(array);

        sumOfNumbersEndedByZero(array);
    }

    private static void countOfNumbersEndedByZero(int[] array) {
        int count = 0;
        for (int j :
                array) {
            if (j % 10 == 0)
                count++;
        }
        System.out.println("Количество чисел, оканчиващихся на 0: " + count);
    }

    private static void sumOfNumbersEndedByZero(int[] array) {
        int sum = 0;
        for (int k :
                array) {
            if (k % 10 == 0)
                sum += k;
        }
        System.out.println("Сумма чисел, оканчиващихся на 0: " + sum);
    }

    private static void fillArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
    }

    private static void findMaxNumber(int[] array) {
        int maxNumber = array[0];
        for (int n :
                array) {
            if(n > maxNumber)
                maxNumber = n;
        }
        System.out.println("Максимальное число: " + maxNumber);
    }
    private static void findMinNumber(int[] array) {
        int minNumber = array[0];
        for (int n :
                array) {
            if(n < minNumber)
                minNumber = n;
        }
        System.out.println("Минимальное число: " + minNumber);
    }
}

