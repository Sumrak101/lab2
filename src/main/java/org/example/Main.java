package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        zadacha1();
        zadacha2();
    }


    public static String zadacha1() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите год:");
        int a = scanner.nextInt();
        if ((a % 4 == 0) && a % 100 != 0) {
            return  "Кол-во дней 366";
        } else if ((a % 4 == 0) && (a % 100 == 0) && (a % 400 == 0)) {
            return  "Кол-во дней 366";
        } else {
            return "Кол-во дней 365";
        }

    }

    public static void zadacha2() {
        Scanner in = new Scanner(System.in);
        int points = 0;

        while (true) {
            System.out.println("Введите кол-во дней");
            int days = in.nextInt();

            System.out.println("Введите год");
            int year = in.nextInt();


            if ((year % 4 == 0) && year % 100 != 0 && days == 366) {
                System.out.println("Правильно!");
                points++;
            } else if ((year % 4 == 0) && (year % 100 == 0) && (year % 400 == 0) && days == 366) {
                System.out.println("Правильно!");
                points++;

            } else if ((!(year % 4 == 0) && !(year % 100 == 0) && !(year % 400 == 0)) && days == 365) {
                System.out.println("Правильно!");
                points++;

            } else if ((year % 4 == 0) && year % 100 != 0 && days == 365) {
                System.out.println("Неправильно!"+" Набрано очков:"+points);
                break;
            } else {
                System.out.println("Неправильно!"+" Набрано очков:"+points);
                break;
            }

            System.out.println("Набрано очков: " + points);

        }


    }
}

