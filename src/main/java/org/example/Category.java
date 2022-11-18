package org.example;

import java.util.ArrayList;

public class Category {
    private String name;
    private ArrayList<Product> products = new ArrayList<>();

    public Category(String name) {
        this.name = name;
    }

    public Category(String name, ArrayList<Product> products) {
        this.name = name;
        this.products = products;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public void printProducts() {
        if (products.isEmpty()) {
            System.out.println("Товаров в категории " + name + " нет");
        } else {
            for (Product item : products) {
                item.print();
            }
        }
    }

    public String getName() {
        return name;
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

}
