package com.example.demo.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Cart {
    Map<Product, Integer> productIntegerMap = new HashMap<>();

    public Cart() {
    }

    public Cart(Map<Product, Integer> productIntegerMap) {
        this.productIntegerMap = productIntegerMap;
    }

    public Map<Product, Integer> getProductIntegerMap() {
        return productIntegerMap;
    }

    public void setProductIntegerMap(Map<Product, Integer> productIntegerMap) {
        this.productIntegerMap = productIntegerMap;
    }

    public boolean checkItem(Product product) {
       for (Map.Entry<Product,Integer> entry:productIntegerMap.entrySet()){
           if (entry.getKey().getId()==product.getId()){
               return true;
           }
       }
       return false;
    }
    private Map.Entry<Product, Integer> selectItemInCart(Product product){
        for (Map.Entry<Product, Integer> entry : productIntegerMap.entrySet()) {
            if(entry.getKey().getId()==(product.getId())){
                return entry;
            }
        }
        return null;
    }

    public void addProduct(Product product) {
        if (!checkItem(product)){
            productIntegerMap.put(product,1);
        }else {
            Map.Entry<Product,Integer> itemEntry = selectItemInCart(product);
            int quantity = itemEntry.getValue()+1;
            productIntegerMap.replace(itemEntry.getKey(),quantity);
        }
    }

   
    public int countPrice() {
        int price = 0;
        for (Map.Entry<Product,Integer> entry:productIntegerMap.entrySet()) {
            price += entry.getKey().getPrice()*entry.getValue();
        }
        return price;
    }

    public int countQuantity() {
        int quantity = 0;
        for (Map.Entry<Product,Integer> entry:productIntegerMap.entrySet()) {
            quantity += entry.getValue();
        }
        return quantity;
    }

    public int countProduct() {
        return productIntegerMap.size();
    }

}
