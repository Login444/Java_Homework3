package org.example;

public class Books {
    private  String title;
    private String author;
    private Integer price;
    private Integer year;
    private Integer sheets;

    public Books(String title, String author, Integer price, Integer year, Integer sheets) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.sheets = sheets;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public Integer getSheets() {
        return sheets;
    }

    public void setSheets(Integer sheets) {
        this.sheets = sheets;
    }

    @Override
    public String toString() {
        return "Books{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                '}';
    }
}
