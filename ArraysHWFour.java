package com.company;

import java.util.Arrays;
import java.util.Random;

public class ArraysHWFour {
    public static void main(String[] args) {
       /* Создать новый массив размера 100 и заполнить его случайными числами из
        диапазона от 0 до 10000.
        Найти максимум среди сумм трех соседних элементов. Для найденной тройки с
        максимальной суммой выведите значение суммы и индекс первого элемента тройки.
       */

        int [] array = new int[100];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10000);
        }
        System.out.println(Arrays.toString(array));
        int maxSum = 0;
        int maxSumId = 0;
        for (int i = 0; i < array.length-2; i++) {
            int sum = 0;
            for (int j = i; j < i + 3 ; j++) {
                sum += array[j];
            }
            if (sum > maxSum){
                maxSum = sum;
                maxSumId = i;
            }
        }
        System.out.println(maxSum + " " + maxSumId);
    }
        
}
