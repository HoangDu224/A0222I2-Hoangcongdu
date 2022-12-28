package com.example.demo.model;

import java.util.ArrayList;
import java.util.List;

public class Cart {
    List<Product> productList = new ArrayList<>();

    public Cart(List<Product> productList) {
        this.productList = productList;
    }

    public Cart() {
    }

    public boolean checkItem(Product product) {
        for (Product product1 : productList) {
            if (product.getId() == product1.getId()) {
                return true;
            }
        }
        return false;
    }

    public void addProduct(Product product) {
        productList.add(product);
    }

    public List<Product> findAll() {
        return productList;
    }

    public int countPrice() {
        int price = 0;
        for (Product product : productList) {
            price += product.getPrice();
        }
        return price;
    }

    public int countQuantity() {
        return productList.size();
    }

    public int countProduct() {
        List<Product> products = new ArrayList<>();
        products.add(productList.get(0));
        for (Product product : productList) {
            for (int i = 0; i < products.size(); i++) {
                if (product.getId() == products.get(i).getId()) {
                    continue;
                } else {
                    products.add(product);
                }
            }
        }
        return products.size();
    }

    public int countProductQuantity(Product product) {
        int quantity = 0;
        for (Product product1 : productList) {
            if (product.getId() == product1.getId()) {
                quantity++;
            }
        }
        return quantity;
    }
    public List<Product> mergeProduct(){
        List<Product> products = new ArrayList<>();
        products.add(productList.get(0));
        for (Product product : productList) {
            for (int i = 0; i < products.size(); i++) {
                if (product.getId() == products.get(i).getId()) {
                    continue;
                } else {
                    products.add(product);
                }
            }
        }
        return products;
    }

}
