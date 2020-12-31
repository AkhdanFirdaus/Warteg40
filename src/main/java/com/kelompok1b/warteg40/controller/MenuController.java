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
    ArrayList<Item> menus = new ArrayList<Item>();
    
    public MenuController() {
        menus.add(new Item(0, "Nasi Goreng", 14000, 1));
        menus.add(new Item(1, "Nasi Kuning", 8000, 1));
        menus.add(new Item(2, "Nasi Uduk", 8000, 1));
        menus.add(new Item(3, "Mie Goreng", 7000, 1));
        menus.add(new Item(4, "Mie Kuah", 6000, 1));
        menus.add(new Item(5, "Es Buah", 12000, 2));
        menus.add(new Item(6, "Jus Buah", 12000, 2));
        menus.add(new Item(7, "Kerupuk", 2000, 3));
    }
    
    public static MenuController getInstance() {
        if(instance == null)
            instance = new MenuController();
        return instance;
    }
    
    public ArrayList<Item> getMenus() {
        return this.menus;
    }
}