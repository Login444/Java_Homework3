package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        List<Books> booksList = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.println("Сколько книг добавляем?");
        int count = scan.nextInt();
        for (int i = 0; i < count; i++) {
            System.out.println((i+1) + "-я книга: ");
            booksList.add(setCollection());
        }
        showCollection(booksList);
        findBooks(booksList);
    }

    /**
     * @apiNote Найти названия книг, в которых простое количество страниц,
     * фамилия автора содержит «А» и год издания после 2010 г, включительно.
     * @param booksList
     */
    private static void findBooks(List<Books> booksList) {
        System.out.println("Названия искомых книг: ");
        for (int i = 0; i < booksList.size(); i++) {
            if (booksList.get(i).getYear() >= 2010){
                if (booksList.get(i).getAuthor().toLowerCase().contains("а")){
                    if (naturalNumber(booksList.get(i).getSheets()) != false){
                        System.out.println(booksList.get(i).getTitle());
                    }
                }
            }

        }
    }

    /**
     * @apiNote Распечатывает заданный список
     * @param booksList
     */
    private static void showCollection(List<Books> booksList) {
        for (int i = 0; i < booksList.size(); i++) {
            System.out.println((i+1)+". " + booksList.get(i).getTitle()
                    + " " + booksList.get(i).getAuthor()
                    + " " + booksList.get(i).getPrice()
                    + " " + booksList.get(i).getYear()
                    + " " + booksList.get(i).getSheets());
        }
    }

    /**
     * @apiNote Заполнение нового элемента коллекции
     * @return book
     */
    private static Books setCollection() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Название: ");
        String title = scan.nextLine();
        System.out.println("Фамилия автора: ");
        String author = scan.nextLine();
        System.out.println("Стоимость: ");
        int price = scan.nextInt();
        System.out.println("Год: ");
        int year = scan.nextInt();
        System.out.println("Колличество страниц: ");
        int sheets = scan.nextInt();
        Books book = new Books(title, author, price, year,sheets);
        return book;
    }

    /**
     * @apiNote Проверка на простое число
     * @param n
     * @return true/false
     */
    private static boolean naturalNumber(int n) {
        boolean a = false;
        int count = 0;
        for (int j = 1; j <= n; j++) {
            if (n > 2 && n % 2 == 0) break;
            if (n % j == 0) {
                count++;
            }
        }
        if (count > 3) a = false;
        if (count == 2) a = true;
        return a;
    }
}
