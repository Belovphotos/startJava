package com.company;

import java.util.Scanner;

public class SwitchOperatorHW {
    /* Задача 1:
    Реализовать программу, которая в консоль выводит название страны, принимая на
    вход название города. Программа должна работать до тех пор, пока не будет введено
    слово “Stop”.
    Реализовать, используя следующие данные:
    Москва, Владивосток, Ростов - Россия
    Рим, Милан, Турин - Италия
    Ливерпуль, Манчестер, Лондон - Англия
    Берлин, Мюнхен, Кёльн - Германия
    При вводе любого другого города, вывести сообщение “Неизвестная страна”.
     */

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        while (true){
//           String city = scanner.nextLine();
//           if (city.equals("Stop")){
//               break;
//           }
//           switch (city){
//               case "Москва":
//               case "Владивосток":
//               case "Ростов":
//                   System.out.println("Россия");
//                   break;
//               case "Рим":
//               case "Милан":
//               case "Турин":
//                   System.out.println("Италия");
//                   break;
//               case "Ливерпуль":
//               case "Манчестер":
//               case "Лондон":
//                   System.out.println("Англия");
//                   break;
//               case "Берлин":
//               case "Мюнхен":
//               case "Кёльн":
//                   System.out.println("Германия");
//                   break;
//               default:
//                   System.out.println("Неизвестная страна");
//           }
//        }

        /* Задача 2:
    Реализовать программу, которая пока работает, принимает на вход от пользователя
два числа - делимое и делитель. Для этих двух чисел программа рассчитывает
результат деления и выводит его в консоль. Программа останавливает свою работу
тогда, когда пользователь вводит 0 в качестве делителя.
(для этих вещественных чисел необходимо использовать тип double и метод
nextDouble() у Scanner’а соответственно).
     */
//        Scanner scanner1 = new Scanner(System.in);
//
//        while (true) {
//            double delimoe = scanner1.nextDouble();
//            double delitel = scanner1.nextDouble();
//            if (delitel == 0)
//                break;
//
//            System.out.println("Результат деления "
//                    + delimoe + " и " + delitel + " равен: "
//                    + delimoe / delitel);
//        }


        Scanner scanner2 = new Scanner(System.in);
        int counter = 0;
        while (counter < 5) {

            double a = scanner2.nextDouble();
            double b = scanner2.nextDouble();

            counter++;

            if (b == 0) {
                System.out.println("Деление на 0");
                continue;
            }

            System.out.println("Ваш ввод: " + a + " и " + b + "." + " Ответ программы: " + a / b);
        }
    }
}
