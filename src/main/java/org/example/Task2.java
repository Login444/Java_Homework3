package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Products2 product1 = new Products2("Milk", "Argentina", 5, 80, 1);
        Products2 product2 = new Products2("Bread", "Russia", 1, 20, 2);
        Products2 product3 = new Products2("Eggs", "Canada", 2, 57, 1);
        Products2 product4 = new Products2("Chicken", "Ukraine", 9, 220, 2);
        Products2 product5 = new Products2("Milk", "Argentina", 10, 15, 3);
        Products2 product6 = new Products2("Beef", "USA", 15, 300, 1);
        Products2 product7 = new Products2("Potato ", "Belarus", 7, 79, 3);
        Products2 product8 = new Products2("Fish", "Armenia", 3, 159, 2);
        Products2 product9 = new Products2("Cola", "Israel", 1, 56, 3);
        Products2 product10 = new Products2("Rum", "Cuba", 2, 150, 1);

        List<Products2> products2List= new ArrayList<>();
        products2List.add(product1);
        products2List.add(product2);
        products2List.add(product3);
        products2List.add(product4);
        products2List.add(product5);
        products2List.add(product6);
        products2List.add(product7);
        products2List.add(product8);
        products2List.add(product9);
        products2List.add(product10);

        Scanner scan = new Scanner(System.in);
        System.out.println("В каком сорте искать? ");
        int findvariety = scan.nextInt();
        int minPrice = 10000000;
        String prodName = " ";


        for (int i = 0; i < products2List.size(); i++) {
            if (products2List.get(i).getVariety() ==  findvariety){
                if (products2List.get(i).getPrice() < minPrice){
                    minPrice = products2List.get(i).getPrice();
                    prodName = products2List.get(i).getName();
                }
            }
        }
        System.out.println("prodName = " + prodName + " " + minPrice);
        scan.close();
    }

}
