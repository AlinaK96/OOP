package org.content;

import java.util.ArrayList;

public class User {
    protected String name;
    protected String password;
    protected Basket userBasket;

    public User(String name, String password) {
        this.name = name;
        this.password = password;
        Basket x = new Basket();
        userBasket = x;
    }

    public User() {
    }

    public String getName() {
        return name;
    }
    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    public ArrayList<Product> getBasket(){
        return userBasket.getProdList();
    }
    public void buySome(Product product, Catalog mag){
        userBasket.addToBasket(product);
        mag.removeFromColl(product);
    }
}