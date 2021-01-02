/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1b.warteg40.model;

import java.util.ArrayList;

/**
 *
 * @author akhda
 */
public class Transaction {
    int idTransaction;
    String customerName;
    String date;
    int paidMoney;
    ArrayList<Item> orderedItem = new ArrayList<Item>();
    
    public Transaction(int idTransaction, String customerName, String date, int paidMoney, ArrayList<Item> orderedItem) {
        this.idTransaction = idTransaction;
        this.customerName = customerName;
        this.date = date;
        this.paidMoney = paidMoney;
        this.orderedItem.addAll(orderedItem);
    }
    
    public int getIdTransaction() {
        return this.idTransaction;
    }
    
    public String getCustomerName() {
        return this.customerName;
    }
    
    public String getDate() {
        return this.date;
    }
    
    public ArrayList<Item> getOrderedItem() {
        return this.orderedItem;
    }
    
    public int getPaidMoney() {
        return this.paidMoney;
    }
    
    public int getCountOrderedItem() {
        return this.orderedItem.size();
    }
    
    public int getSubTotal() {
        int subTotal = 0;
        for (Item item : orderedItem) {
            subTotal += item.getSubTotalItem();
        }
        return subTotal;
    }
    
    public int getChangeMoney() {
        return this.paidMoney - this.getSubTotal();
    }
}
