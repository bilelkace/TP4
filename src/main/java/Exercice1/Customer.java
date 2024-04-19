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
public class Customer {

   
    private String firstName;
    private String lastName;
    private ArrayList<BankAccount> accounts;

    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.accounts = new ArrayList<>();
    }

    public void addAccount(BankAccount account) {
        this.accounts.add(account);
    }

    public void removeAccount(BankAccount account) {
        this.accounts.remove(account);
    }

    public Double getTotalAccountBalance() {
        double totalBalance = 0.0;
        for (BankAccount account : this.accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }

    public boolean transferFunds(BankAccount sourceAccount, BankAccount destinationAccount, Double amount) {
        if (sourceAccount != null && destinationAccount != null && amount > 0) {
            if (sourceAccount.getBalance() >= amount) {
                sourceAccount.withdraw(amount);
                destinationAccount.deposit(amount);
                return true;
            } else {
                System.out.println("Transfert impossible : Solde insuffisant sur le compte source");
            }
        } else {
            System.out.println("Transfert impossible : Données invalides");
        }
        return false;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
}

