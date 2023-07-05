package com.checkpoint;

public class Product {
    String name;
    Double price;
    int quantity;


    public Product(String name, Double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String toString() {
        return "Product name: " + name + ", price: " + price + ",quantity: " + quantity;
    }

    public static void main(String[] args) {
        Product product = new Product("Phone", 20_000.00, 10);

        System.out.println(product);
    }
}

