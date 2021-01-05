/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1b.warteg40.controller;

import com.kelompok1b.warteg40.model.Item;
import com.kelompok1b.warteg40.model.Transaction;
import java.util.ArrayList;

/**
 *
 * @author akhda
 */
public class Searching {
    public Item cariMenu(String keyword, ArrayList<Item> array) {
        for (Item item : array) {
            if (item.getItemName().equalsIgnoreCase(keyword)) {
                return item;
            }
        }
        return null;
    }
    
    public Transaction cariTransaksi(String keyword, ArrayList<Transaction> array) {
        for (Transaction transaction : array) {
            if (transaction.getCustomerName().equalsIgnoreCase(keyword)) {
                return transaction;
            }
        }
        return null;
    }
}
