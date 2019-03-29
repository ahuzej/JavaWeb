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
public class ProductFactory {
    public static ArrayList<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("Apple", 10));
        products.add(new Product("Orange", 15));
        products.add(new Product("Banana", 30));
        products.add(new Product("Corn", 50));
        products.add(new Product("Kiwi", 100));
        return products;
    }
}
