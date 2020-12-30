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
}
