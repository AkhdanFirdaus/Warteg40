/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1b.warteg40.controller;

import com.kelompok1b.warteg40.model.Item;
import com.kelompok1b.warteg40.model.Transaction;
import java.util.LinkedList;

/**
 *
 * @author akhda
 */
public class TransactionController {
    LinkedList<Transaction> transactions = new LinkedList<Transaction>();
    
    public boolean pay(int money) {
        CartController cart = new CartController();
        if (money >= cart.getSubTotal()) {
            int lastId = transactions.getLast().getIdTransaction() + 1;
            Transaction newTransaction = new Transaction(lastId, "Customer Name",  "Senin", money, cart.cart);
            transactions.add(newTransaction);
            System.out.println("Sukses transaksi!");
            return true;
        } else {
            System.out.println("Uang tidak cukup!");
            return false;
        }
    }
    
    public void displayTransaction() {
        for (Transaction transaction : transactions) {
            System.out.println("nama      : " + transaction.getCustomerName());
            System.out.println("subTotal  : " + transaction.getSubTotal());
            System.out.println("paid      : " + transaction.getPaidMoney());
            System.out.println("change    : " + transaction.getChangeMoney());
            
            System.out.println("items : ");
            for (Item item: transaction.getOrderedItem()) {
                System.out.println("item  : " + item.getItemName());
                System.out.println("cat   : " + item.getCategory());
                System.out.println("price : " + item.getPrice());
                System.out.println("qty   : " + item.getQty());
            }
        }
        
    }
}
