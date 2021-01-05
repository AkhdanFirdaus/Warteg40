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
public class Sorting {
    public ArrayList<Item> sortMenu(ArrayList<Item> array, int type) {
        System.out.println(array);
        int n = array.size() - 1;

        for (int gap = n / 2; gap > 0; gap /= 2) {
          for (int i = gap; i < n; i += 1) {
            Item temp = array.get(i);

            int j = -1;
            switch (type) {
                case 0:
                    for (j = i; j >= gap && array.get(j - gap).getId() > temp.getId(); j -= gap)
                        array.set(j, array.get(j-gap));
                    break;
                case 1:
                    for (j = i; j >= gap && array.get(j - gap).getItemName().compareTo(temp.getItemName()) > 0; j -= gap)
                        array.set(j, array.get(j-gap));
                    break;
                case 2:
                    for (j = i; j >= gap && array.get(j - gap).getCategory() > temp.getCategory(); j -= gap)
                        array.set(j, array.get(j-gap));
                    break;
                case 3:
                    for (j = i; j >= gap && array.get(j - gap).getPrice() > temp.getPrice(); j -= gap)
                        array.set(j, array.get(j-gap));
                    break;
            }

            array.set(j, temp);
          }
        }
        System.out.println(array);
        return array;
    }
    
    public ArrayList<Transaction> sortTransaction(ArrayList<Transaction> array, int type) {
        System.out.println(array);
        int n = array.size() - 1;

        for (int gap = n / 2; gap > 0; gap /= 2) {
          for (int i = gap; i < n; i += 1) {
            Transaction temp = array.get(i);

            int j = -1;
            switch (type) {
                case 0:
                    for (j = i; j >= gap && array.get(j - gap).getIdTransaction()> temp.getIdTransaction(); j -= gap)
                        array.set(j, array.get(j-gap));
                    break;
                case 1:
                    for (j = i; j >= gap && array.get(j - gap).getCustomerName().compareTo(temp.getCustomerName()) > 0; j -= gap)
                        array.set(j, array.get(j-gap));
                    break;
                case 2:
                    for (j = i; j >= gap && array.get(j - gap).getSubTotal()> temp.getSubTotal(); j -= gap)
                        array.set(j, array.get(j-gap));
                    break;
            }

            array.set(j, temp);
          }
        }
        System.out.println(array);
        return array;
    }
}
