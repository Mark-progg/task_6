package org.example;

public class Main {
    public static void main(String[] args) {
        Category categoryGPU = new Category("GPU");
        Category categoryCPU = new Category("CPU");

        Product productGPU1 = new Product("GTX 2101 TI", 350, 4.5);
        Product productGPU2 = new Product("GT 2000 M", 150, 2.5);

        Product productCPU1 = new Product("i-7 12600 ", 250, 4.9);
        Product productCPU2 = new Product("pentium 4Q", 50, 1.5);

        System.out.println("Заполнили товарами две категории и вывели их содежимое:");
        categoryGPU.addProduct(productGPU1);
        categoryGPU.addProduct(productGPU2);
        System.out.println("Категория: " + categoryGPU.getName());
        categoryGPU.printProducts();

        categoryCPU.addProduct(productCPU1);
        categoryCPU.addProduct(productCPU2);
        System.out.println("Категория: " + categoryGPU.getName());
        categoryCPU.printProducts();


        System.out.println("Создали и заполнили корзину товарами, создали пользователя и вывели его корзину:");
        Basket basket = new Basket();
        basket.addProduct(productCPU1);
        basket.addProduct(productGPU1);
        basket.addProduct(productGPU2);
        User user = new User("User", "pass", basket);
        System.out.println("Пользователь с логином: " + user.getLogin() + " иммет вот такую корзину:");
        user.getBasket().printBasket();
        System.out.println("Суммарная стоиомть корзины: " + user.getBasket().getBasketPrice());


    }
}
