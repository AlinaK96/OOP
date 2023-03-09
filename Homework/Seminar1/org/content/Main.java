package org.content;


import java.util.ArrayList;

public class Main {
    public static void printMassive(ArrayList<Product> arr) {

        for (Product item : arr
        ) {
            System.out.println(item.toString());
        }
        System.out.println("---");
    }

    public static void main(String[] args) {
        Catalog Entot = new Catalog("Supermarket");
        Product Bananas = new Product("Bananas", 89, 8);
        Entot.addToColl(Bananas);
        Product Chocolate = new Product("Chocolate", 105, 6);
        Entot.addToColl(Chocolate);
        Product Milk = new Product("Milk", 82, 6);
        Entot.addToColl(Milk);
        Product Domestos = new Product("Chemist", 325, 7);
        Entot.addToColl(Domestos);
        ProductCategory Wine = new ProductCategory("Wine");
        Entot.addToColl(Wine);
        User Max = new User("Max", "148");
        User Kate = new User("Kate", "9584");
        User Alina = new User("Alina", "3247");
        ArrayList<Product> products = Entot.getProdList();
        printMassive(products);

        Max.buySome(Chocolate, Entot);
        ArrayList<Product> Maxproducts = Max.getBasket();
        printMassive(Maxproducts);

        Kate.buySome(Bananas, Entot);
        ArrayList<Product> Kateproducts = Kate.getBasket();
        printMassive(Kateproducts);

        ArrayList<Product> Alinaproducts = Alina.getBasket();
        printMassive(Alinaproducts);

    }
}