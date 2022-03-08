package com.company;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введите  число a: ");
        System.out.println("Введите  число b : ");
        System.out.println("Введите  число c: ");
        Scanner sc = new Scanner(System.in);
        float a = sc.nextInt();
        float b = sc.nextInt();
        float c = sc.nextInt();
        float d = (a + b + c) / 3;
        if (a < b && a < c && b > c) {
            System.out.println("a - наименьшее; b - наибольшее");
            System.out.println("Среднеарифметическое значение" + d);
        } else {
            if (a < b && a < c && b < c) {
                System.out.println("a - наименьшее; c - наибольшее");
                System.out.println("Среднеарифметическое значение" + d);
            } else {
                if (c < b && c < a && b < a) {
                    System.out.println("c - наименьшее; a - наибольшее");
                    System.out.println("Среднеарифметическое значение" + d);
                } else {
                    if (c < b && c < a && b > a) {
                        System.out.println("c - наименьшее; b - наибольшее");
                        System.out.println("Среднеарифметическое значение" + d);
                    }
                }
            }
        }
    }
}
