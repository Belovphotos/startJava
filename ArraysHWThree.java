package com.company;

import java.util.Arrays;
import java.util.Random;

public class ArraysHWThree {
    public static void main(String[] args) {
        /* 3. Заполнить двумерный массив (матрицу) случайными числами от 0 до 50. Размер
              матрицы задать m=12, n=8 (m - размерность по строкам, n - размерность по колонкам).
              В консоль вывести индекс строки, сумма чисел в которой максимальна. Если таких
              строк несколько, вывести индекс последней из них.
              Пример сгенерированной матрицы (для простоты m=3, n=5):
         */
        int m = 12;
        int n = 8;
        int[][] array = new int[m][n];
        Random random = new Random();

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = random.nextInt(50);
            }
        }
       int maxSum = 0;
        int maxSumId = 0;
        for (int i = 0; i < array.length; i++) {
            int sum = 0;
            for (int j = 0; j < array[i].length; j++) {
                sum += array[i][j];
            }
            if (sum > maxSum) {
                maxSum = sum;
                maxSumId = i;
            }
        }
        System.out.println("Идекс строки, сумма чисел в которой максимальна: " + maxSumId);
    }

}
