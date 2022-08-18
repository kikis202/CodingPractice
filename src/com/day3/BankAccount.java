package com.day3;

/*
3) create a class "BankAccount" with property "balance" (should be decimal number)
    * create empty default constructor for it
    * create a constructor with parameter for setting balance.
    * create a method "deposit" with one parameter "amount" (decimal number)
        which allows the user to increase the balance.
    * create a method "withdraw" with one parameter "amount"
        (decimal number) which allows the user to decrease the balance.
    * create a method "printBalance" which displays the current balance to user
    * method for transfer balance from one bank account to another
 */

public class BankAccount {
    private double balance;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double b) {
        balance = b;
    }

    /** allows the user to increase the balance **/
    public void deposit(double amount) {
        if (amount > 0) balance += amount;
        else System.out.println("Error - Negative deposit");
    }

    /** allows the user to decrease the balance **/
    public void withdraw(double amount) {
        if (amount > 0) {
            if (balance>=amount) balance -= amount;
            else System.out.println("Error - insufficient funds");
        } else {
            System.out.println("Error - Negative withdraw");
        }
    }

    /** displays the current balance to user **/
    public void printBalance() {
        System.out.printf("Current balance: %f%n", balance);
    }

    /** method for transfer balance from one bank account to another **/
    public void transferFunds(BankAccount ba, double amount) {
        if (amount <= 0) {
            System.out.println("Error - Negative withdraw");
            return;
        }
        if (balance < amount) {
            System.out.println("Error - insufficient funds");
            return;
        }
        this.withdraw(amount);
        ba.deposit(amount);
    }
}
