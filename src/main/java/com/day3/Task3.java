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
public class Task3 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount friendsAccount = new BankAccount(150);

        myAccount.deposit(55);
        myAccount.withdraw(5);
        myAccount.printBalance();

        System.out.println();
        myAccount.transferFunds(friendsAccount,30);
        myAccount.printBalance();
        friendsAccount.printBalance();
    }
}
