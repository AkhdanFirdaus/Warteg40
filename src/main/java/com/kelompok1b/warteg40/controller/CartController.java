/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1b.warteg40.controller;

import com.kelompok1b.warteg40.model.Item;
import java.util.ArrayList;

/**
 *
 * @author akhda
 */
public class CartController {
    private static CartController instance = null;
    ArrayList<Item> cart = new ArrayList<Item>();
    
    public static CartController getInstance() {
        if (instance == null)
            return new CartController();
        return instance;
    }
    
    public void addToCart(Item item) {
        if (cart.contains(item)) {
            cart.get(cart.indexOf(item)).plusQty();
            System.out.println("qty item ditambah");
        } else {
            cart.add(item);
            System.out.println("item ditambah");   
        }
        displayCart();
    }
    
    public void minItem(Item item) {
        if (item.getQty() > 1) {
            cart.get(cart.indexOf(item)).minQty();
        } else {
            cart.remove(item);
        }
    }
    
    public void clearCart() {
        cart.clear();
    }
    
    public int getSubTotal() {
        int subTotal = 0;
        for (Item item : cart) {
            subTotal += item.getSubTotalItem();
        }
        return subTotal;
    }
    
    public ArrayList<Item> getCart() {
        return this.cart;
    }
    
    public void displayCart() {
        if (cart.isEmpty()) {
            System.out.println("Cart Kosong");
        } else {
            for (Item item : cart) {
                System.out.println("nama  : " + item.getItemName());
                System.out.println("cat   : " + item.getCategory());
                System.out.println("price : " + item.getPrice());
                System.out.println("qty   : " + item.getQty());
            }
        }
    }
}
