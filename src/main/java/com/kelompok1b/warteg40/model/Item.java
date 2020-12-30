/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1b.warteg40.model;

/**
 *
 * @author akhda
 */

public class Item {
    private int id;
    private String foodName;
    private int category;
    private int qty = 0;
    
    public Item(int id, String foodName, int category) {
        this.id = id;
        this.foodName = foodName;
        this.category = category;
    }
    
    public int getId() {
        return this.id;
    }
    
    public String getItem() {
        return this.foodName;
    }
    
    public int getCategory() {
        return this.category;
    }
    
    public int getQty() {
        return this.qty;
    }
    
    public void plusQty() {
        this.qty++;
    }
    
    public void minQty() {
        this.qty--;
    }
}
