package org.content;


public class Product {
    private String name;
    private int price;
    private int reiting;

    public Product(String name, int price, int reiting) {
        this.name = name;
        this.price = price;
        this.reiting = reiting;
    }

    public Product() {
    }

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", reiting=" + reiting +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getReiting() {
        return reiting;
    }

    public void setReiting(int reit) {
        this.reiting = reit;
    }
}