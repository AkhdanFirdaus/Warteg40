/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1b.warteg40.controller;

import com.kelompok1b.warteg40.model.User;
import java.util.LinkedList;
import java.util.TreeSet;

/**
 *
 * @author akhda
 */
public class UserController {
    private static UserController instance = null;
    TreeSet<User> users = new TreeSet<User>();
    User loggedInUser;

    public UserController() {
        User admin = new User(0, "admin", "admin", 0);
        users.add(admin);
    }
    
    //Singleto
    public static UserController getInstance() {
        if(instance == null)
            instance = new UserController();
        return instance;
    }

    
    public void setUser(User user) {
        this.loggedInUser = user;
    }
    
    public User getLoggedInUser() {
        return this.loggedInUser;
    }
    
    public boolean login(String username, String password) {
        System.out.println("Pass : " + password);
        for (User foundUser : users) {
            if (foundUser.getName().equals(username) && foundUser.getPassword().equals(password)) {
                setUser(foundUser);
                System.out.println("Sukses Login!");
                return true;
                //redirect dashboard
            }
        }
        System.out.println("Gagal Login!");
        return false;
    }
    
    public boolean register(String username, String password) {
        int newId = users.last().getId() + 1;
        users.add(new User(newId, username, password, 1));
        System.out.println("Sukses Register!");
        return true;
    }
    
    public void logout() {
        loggedInUser = null;
    }
    
    public void displayUsers() {
        for (User user : users) {
            System.out.println("id  : " + user.getId());
            System.out.println("nama: " + user.getName());
            System.out.println("role: " + user.getRole());
        }
    }
}
