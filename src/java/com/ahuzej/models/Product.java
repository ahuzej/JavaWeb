/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ahuzej.models;

/**
 *
 * @author programer10
 */
public class Product {
    private static int counter=1;
    private int id;
	private int quantity;

    public int getId() {
        return id;
    }
    private String name;
    private double price;

    public String getName() {
        return name;
    }
	
	public int getQuantity(){
		return quantity;
	}
	
	public void setQuantity(int quantity){
		this.quantity = quantity;
	}

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, double price) {
        this.name = name;
        this.price = price;
        this.id = counter++;
    }
    
}
