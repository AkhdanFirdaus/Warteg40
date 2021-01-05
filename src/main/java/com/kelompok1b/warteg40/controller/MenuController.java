package com.kelompok1b.warteg40.controller;

import com.kelompok1b.warteg40.model.Item;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author akhda
 */
public class MenuController {
    public static MenuController instance = null;
    private ArrayList<Item> menus = new ArrayList<Item>();
    
    public MenuController() {
        menus.add(new Item(0, "Nasi Goreng", 1, 14000));
        menus.add(new Item(1, "Nasi Kuning", 1, 8000));
        menus.add(new Item(2, "Nasi Uduk", 1, 8000));
        menus.add(new Item(3, "Mie Goreng", 1, 7000));
        menus.add(new Item(4, "Mie Kuah", 1, 6000));
        menus.add(new Item(5, "Es Buah", 2, 12000));
        menus.add(new Item(6, "Jus Buah", 2, 12000));
        menus.add(new Item(7, "Kerupuk", 3, 2000));
    }
    
    public static MenuController getInstance() {
        if(instance == null)
            instance = new MenuController();
        return instance;
    }
    
    public boolean addMenu(String foodName, int category, float price) {
        int lastId = menus.isEmpty() ? 1 : menus.get(menus.size() - 1).getId() + 1;
        Item newItem = new Item(lastId, foodName, category, price);
        menus.add(newItem);
        System.out.println("Menu telah ditambahkan");
        
        return true;
    }
    
    public boolean editMenu(int id, String foodName, int category, float price) {
        Item newItem = menus.set(id, new Item(id, foodName, category, price));
        System.out.println("Menu telah di update");
        return true;
    }
    
    public boolean deleteMenu(int id) {
        menus.remove(id);
        return true;
    }
    
    public ArrayList<Item> getMenus() {
        return this.menus;
    }
    
    public void sort(int type) {
        Sorting sort = new Sorting();
        this.menus = sort.sortMenu(menus, type);
    }
    
    public void displayMenu() {
        for (Item item : this.menus) {
            System.out.println("ID   = " + item.getId());
            System.out.println("Nama = " + item.getItemName());
            System.out.println("Harga= " + item.getPrice());
            System.out.println("Kat  = " + item.getNameCategory());
        }
    }
}