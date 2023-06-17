package org.example;

import java.util.ArrayList;
import java.util.List;

public class Task1 {
    public static void main(String[] args) {
        Products product1 = new Products("Высший апельсин", 60, 1);
        Products product2 = new Products("Сыр", 50, 2);
        Products product3 = new Products("Высший сырок", 150, 2);
        Products product4 = new Products("Говядина", 30, 3);
        Products product5 = new Products("Арбуз высший", 89, 2);
        Products product6 = new Products("Кола", 60, 3);
        Products product7 = new Products("Высший кефир", 300, 1);

        List<Products> productsList = new ArrayList<>();
        productsList.add(product1);
        productsList.add(product2);
        productsList.add(product3);
        productsList.add(product4);
        productsList.add(product5);
        productsList.add(product6);
        productsList.add(product7);

        int maxPrice = 0;
        int pos = -1;

        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getVariety() <= 2 && productsList.get(i).getVariety() > 1) {
                if (productsList.get(i).getName().toLowerCase().contains("высший")) {
                    if (productsList.get(i).getPrice() > maxPrice) {
                        maxPrice = productsList.get(i).getPrice();
                        pos = i;
                    }
                }

            }
        }
        System.out.println("Наибольшая цена у товара " + productsList.get(pos).getVariety() + " сорта"
                + " под названием: " + productsList.get(pos).getName() + " и она равна: "
                + productsList.get(pos).getPrice());
    }
}