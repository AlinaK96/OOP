package org.content;

import java.util.ArrayList;

public class ProductCategory {
    private String categoryName;
    private ArrayList<Product> prodList;

    public ProductCategory(String categoryName, ArrayList<Product> productList) {
        this.categoryName = categoryName;
        this.prodList = productList;
    }

    public ProductCategory(String categoryName) {
        this.categoryName = categoryName;
        this.prodList = new ArrayList<>();
    }

    public void addToCatalog(Product product){
        this.prodList.add(product);
    }

    public String getCategoryName() {
        return categoryName;
    }

    public void setCategoryName(String categoryName) {
        this.categoryName = categoryName;
    }
    public ArrayList<Product> getProdList() {
        return prodList;
    }
}

