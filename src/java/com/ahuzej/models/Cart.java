/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej.models;

import java.util.ArrayList;

/**
 *
 * @author programer10
 */
public class Cart {
    
    private ArrayList<Product> products;

    public ArrayList<Product> getProducts() {
        return products;
    }

    public void setProducts(ArrayList<Product> products) {
        this.products = products;
    }

    public Cart() {
        this.products = new ArrayList<>();
    }
    
    public int size() {
        return products.size();
    }
    
}
