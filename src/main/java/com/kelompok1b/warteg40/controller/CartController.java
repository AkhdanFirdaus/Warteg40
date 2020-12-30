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
    ArrayList<Item> cart = new ArrayList<Item>();
    
    public void addToCart(Item item) {
        int length = cart.size()-1;
        //length = 4
        //id = 5
        for (int i = 0; i<length; i++) {
            if (cart.get(i).getId() == item.getId()) {
                Item newItem = cart.get(i);
                newItem.plusQty();
                cart.set(i, newItem);
                break;
            } 
            if ( i > length ){
                cart.add(item);
                break;
            }
        }
    }
    
    public void minItem(Item item) {
        if (item.getQty() > 1) {
            cart.get(item.getId()).minQty();
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
    
    public void displayCart() {
        for (Item item : cart) {
            System.out.println("nama  : " + item.getItemName());
            System.out.println("cat   : " + item.getCategory());
            System.out.println("price : " + item.getPrice());
            System.out.println("qty   : " + item.getQty());
        }
    }
}
