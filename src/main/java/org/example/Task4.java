package org.example;

import java.util.ArrayList;

import java.util.Random;
import java.util.Scanner;

public class Task4 {
    // Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < n; i++) {
            list.add(i, rand.nextInt(10));
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + ", ");
        }

        int min = 100;
        int max = 0;
        int numbers_sum = 0;
        for (int i = 0; i < list.size(); i++) {
            numbers_sum += list.get(i);
            if (list.get(i) > max){
                max = list.get(i);
            }
            if (list.get(i) < min){
                min = list.get(i);
            }
        }
        System.out.println("min = " + min);
        System.out.println("max = " + max);
        int middle = numbers_sum / list.size();
        System.out.println("middle = " + middle);
    }
}
