package org.example;

import java.util.ArrayList;

public class Basket {
    private ArrayList<Product> products = new ArrayList<>();

    public Basket() {

    }

    public Basket(ArrayList<Product> products) {
        this.products = products;
    }

    public void addProduct(Product product) {
        products.add(product);
    }

    public void removeProduct(Product product) {
        products.remove(product);
    }

    public ArrayList<Product> getProducts() {
        return products;
    }

    public int getBasketPrice() {
        int sum = 0;
        for (Product item : products) {
            sum += item.getPrice();
        }
        return sum;
    }

    public void printBasket() {
        if (products.isEmpty()) {
            System.out.println("Корзина пуста");
        } else {
            System.out.println("Содержимое корзины");
            for (Product item : products) {
                item.print();
            }
        }
    }
}
