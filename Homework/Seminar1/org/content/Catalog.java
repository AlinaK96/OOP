package org.content;

import java.util.ArrayList;

public class Catalog {
    private String CatalogName;
    private ArrayList<Product> prodList;

    public Catalog(String magazineName) {
        this.CatalogName = magazineName;
        this.prodList = new ArrayList<>();
    }

    public void addToColl(Product product){
        this.prodList.add(product);
    }

    public String getmagazineName() {
        return CatalogName;
    }

    public void setmagazineName(String magazineName) {
        this.CatalogName = magazineName;
    }
    public ArrayList<Product> getProdList() {
        return prodList;
    }
    public void removeFromColl(Product product){this.prodList.remove(product);}
}
