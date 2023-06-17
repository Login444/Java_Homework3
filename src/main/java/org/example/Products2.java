package org.example;

public class Products2 {
    private String name;
    private String country;
    private Integer weight;
    private Integer price;
    private Integer variety;

    public Products2(String name, String country, Integer weight, Integer price, Integer variety) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.variety = variety;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
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
