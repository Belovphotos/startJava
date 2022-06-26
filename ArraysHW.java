package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysHW {

    /*  Задание 1. С клавиатуры вводится число n - размер массива. Необходимо создать массив
указанного размера и заполнить его случайными числами от 0 до 10. Затем вывести
содержимое массива в консоль, а также вывести в консоль информацию о:
а) Длине массива
б) Количестве чисел больше 8
в) Количестве чисел равных 1
г) Количестве четных чисел
д) Количестве нечетных чисел
е) Сумме всех элементов массива
    */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] array = new int[n];

        fillingArrayRandomNumbers(n, array);

        System.out.println("Длина массива: " + array.length);

        numbersLargerThan8(array);

        numbers1Array(array);

        evenArrayNumers(array);

        unEvenArrayNumers(array);

        sumOfNumbers(array);


    }

    private static void sumOfNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Сумма всех элементов в массиве: " + sum);
    }

    private static void numbers1Array(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == 1) {
                count++;
            }
        }
        System.out.println("Количество 1 в массиве: " + count);
    }

    private static void evenArrayNumers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0 && array[i] > 0) {
                count++;
            }
        }
        System.out.println("Количество чётных чисел: " + count);
    }

    private static void fillingArrayRandomNumbers(int n, int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * n);
        }
        System.out.println("Массив случайных чисел от 0 до " + n + ": " + Arrays.toString(array));
    }

    private static void numbersLargerThan8(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 8) {
                count++;
            }
        }
        System.out.println("Чисел больше 8: " + count);
    }

    private static void unEvenArrayNumers(int[] array) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0 && array[i] > 0) {
                count++;
            }
        }
        System.out.println("Количество нечётных чисел: " + count);
    }
}
