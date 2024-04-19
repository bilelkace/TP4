/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice1;

import java.util.ArrayList;

/**
 *
 * @author Bilel
 */
public class Bank {

   
    private ArrayList<Customer> clients;

    public Bank() {
        clients = new ArrayList<>();
    }

    public void addCustomer(Customer client) {
        clients.add(client);
    }

    public void removeCustomer(Customer client) {
        clients.remove(client);
    }

    public Double getTotalBalance() {
        double totalBalance = 0.0;
        for (Customer client : clients) {
            totalBalance += client.getTotalAccountBalance();
        }
        return totalBalance;
    }
}

