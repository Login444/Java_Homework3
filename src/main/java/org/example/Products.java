package org.example;

public class Products {
    private String name;
    private Integer price;
    private Integer variety;

    public Products(String name, Integer price, Integer variety) {
        this.name = name;
        this.price = price;
        this.variety = variety;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getVariety() {
        return variety;
    }

    public void setVariety(Integer variety) {
        this.variety = variety;
    }

}
