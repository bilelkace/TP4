/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice1;

/**
 *
 * @author Bilel
 */
public class SavingsAccount extends BankAccount {
 

    private Double interestRate;

    public SavingsAccount(Integer accountNumber, Double initialBalance, Double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

    public void calculateInterest() {
        double interest = this.balance * this.interestRate ;
        this.balance += interest;
    }

    public Double getInterestRate() {
        return this.interestRate;
    } 

    @Override
    public void withdraw(double amount) {
        if (amount > 0 && amount <= this.balance) {
            super.withdraw(amount);
        } else if (amount > this.balance) {
            double penalty = amount - balance;
            balance -= balance; 
            balance -= penalty; 
        }
    }
}