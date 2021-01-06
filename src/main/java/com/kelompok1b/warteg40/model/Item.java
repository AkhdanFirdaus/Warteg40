/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1b.warteg40.model;

/**
 *
 * @author akhdan
 */

public class Item {
    private int id;
    private String foodName;
    private int category;
    private float price;
    private int qty = 1;

    public Item(int id, String foodName, int category, float price) {
        this.id = id;
        this.foodName = foodName;
        this.category = category;
        this.price = price;
    }

    public int getId() {
        return this.id;
    }

    public String getItemName() {
        return this.foodName;
    }

    public String getNameCategory() {
        switch (this.category) {
            case 1:
                return "Makanan";
            case 2:
                return "Minuman";
            case 3:
                return "Tambahan";
            default:
                return "Tidak Ada";
        }
    }

    public int getCategory() {
        return this.category;
    }

    public int getQty() {
        return this.qty;
    }

    public float getPrice() {
        return this.price;
    }

    public float getSubTotalItem() {
        return this.price * this.qty;
    }

    public void plusQty() {
        this.qty++;
    }

    public void minQty() {
        this.qty--;
    }

    public void displayItem() {
        System.out.println(this.getId());
        System.out.println(this.getItemName());
        System.out.println(this.getCategory());
        System.out.println(this.getPrice());
    }
}
