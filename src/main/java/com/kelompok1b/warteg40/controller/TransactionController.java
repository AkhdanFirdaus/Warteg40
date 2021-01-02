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
    private static TransactionController instance = null;
    private CartController cartController;
    private LinkedList<Transaction> transactions = new LinkedList<Transaction>();
    
    public TransactionController(CartController newCart) {
        this.cartController = newCart;
    }
    
    public static TransactionController getInstance(CartController newCart) {
        if (instance == null)
            instance = new TransactionController(newCart);
        return instance;
    }
    
    public boolean pay(String name, int money) {
        if (money >= cartController.getSubTotal()) {
            int lastId = transactions.isEmpty() ? 1 : transactions.getLast().getIdTransaction() + 1;
            Transaction newTransaction = new Transaction(lastId, name,  "Senin", money, cartController.cart);
            transactions.add(newTransaction);
            System.out.println("Sukses transaksi!");
            cartController.clearCart();
            return true;
        } else {
            System.out.println("Uang tidak cukup!");
            return false;
        }
    }
    
    public LinkedList<Transaction> getTransactions() {
        return this.transactions;
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
