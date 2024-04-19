/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice1;

/**
 *
 * @author Bilel
 */
public class CheckingAccount extends BankAccount {

    private Double overdraftAllowed;

    public CheckingAccount(Integer accountNumber, Double initialBalance, Double overdraftAllowed) {
        super(accountNumber, initialBalance);
        this.overdraftAllowed = overdraftAllowed;
    }

    public void setOverdraftAllowed(Double overdraftAllowed) {
        this.overdraftAllowed = overdraftAllowed;
    }

    public Double getOverdraftAllowed() {
        return this.overdraftAllowed;
    }

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            super.withdraw(amount);
        } else if (amount > this.balance && amount <= this.balance + this.overdraftAllowed) {
            this.balance -= amount;
        } else {
            System.out.println("Retrait impossible : Découvert non autorisé");
        }
    }
}

