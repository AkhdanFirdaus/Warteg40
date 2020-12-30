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
public class User {
    private int id;
    private String name;
    private String password;
    private int role;
    
    //Admin
    User(int id, String name, String password, int role) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.role = role;
    }
    
    //Customer
    User(int id, String name, int role) {
        this.id = id;
        this.name = name;
        this.role = role;
    }
    
    public String getName() {
        return this.name;
    }
    
    public int getRole() {
        return this.role;
    }
}
