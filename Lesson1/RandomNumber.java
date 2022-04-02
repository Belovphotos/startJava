package com.company;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    //Игра “Угадай число”
    //компьютер "загадывает" целое число в диапазоне (0, 100], которое игроку в автоматическом режиме необходимо угадать
    //меняйте значение переменной, хранящей числа игрока, автоматически по какому-то простому алгоритму, без применения ввода с клавиатуры или генерации случайных чисел (как в Калькуляторе)
    //после каждой неудачной попытки игрока выводите подсказку:
    //"данное число больше того, что загадал компьютер" или
    //"данное число меньше того, что загадал компьютер"
    //если число угадано — "Вы победили!"
    //игра продолжается до тех пор, пока число не будет угадано
    public static void main(String[] args) {
        int randomNumber = new Random().nextInt(100);
        Scanner console = new Scanner(System.in);
        while (true) {
            int number = console.nextInt();
            if (number < randomNumber) {
                System.out.println("Загаданное число больше");
            } else if (randomNumber < number) {
                System.out.println("Загаданное число меньше");
            } else {
                System.out.println("Вы победили! Загаданное число равно " + randomNumber);
                break;
            }
        }
    }
}
