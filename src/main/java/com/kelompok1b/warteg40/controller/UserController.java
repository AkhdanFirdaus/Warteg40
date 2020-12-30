/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kelompok1b.warteg40.controller;

import com.kelompok1b.warteg40.model.User;
import java.util.LinkedList;

/**
 *
 * @author akhda
 */
public class UserController {
    LinkedList<User> users = new LinkedList<User>();
    User loggedInUser;
    
    public boolean login(String username, String password) {
        for (User foundUser : users) {
            if (foundUser.getName().equals(username) && foundUser.getPassword().equals(password)) {
                loggedInUser = foundUser;
                System.out.println("Sukses Login!");
                return true;
                //redirect dashboard
            }
        }
        System.out.println("Gagal Login!");
        return false;
    }
    
    public void register(String username, String password) {
        int newId = users.getLast().getId() + 1;
        users.add(new User(newId, username, password, 1));
        System.out.println("Sukses Register!");
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
