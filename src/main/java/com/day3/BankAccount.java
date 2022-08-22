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
/*
4) update your solution:
        * Encapsulate the balance property so it is private
        * add to "withdraw" method, so it would be impossible to withdraw
          more money than exists in bank account. If there is an attempt to withdraw
          more money than exists in bank account, output message:
            "There is not enough funds."
        * Modify "transferFrom" method so it would be impossible to transfer more
          money from the other account than it's balance.
                For example, if bank account A has 50 units and bank account B has 25 units
                and we try to transfer 30 units from B to A, then it should output:
                    "Transfer canceled. You are trying to transfer 30 units, but only 25 are available."
        * add a limit for depositing money. If the deposit is greater than 5000, then it should not
          do the deposit and output message:
              "Transaction canceled. Max deposit - 5000 | Your deposit: 6000"
        * call these methods and demonstrate how they work, for example:
            * write a code which tries to withdraw more money than there is in bank account
            * write a code which tries to deposit more than max limit
            * write a code which tries to transfer more money from one account to another account than possible
 */

public class BankAccount {
    private double balance;
    private final double depositLimit = 5000;

    public BankAccount() {
        balance = 0;
    }

    public BankAccount(double b) {
        balance = b;
    }

    /**
     * allows the user to increase the balance
     **/
    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Error - Negative deposit");
            return;
        }
        if (amount > depositLimit) {
            System.out.printf("Transaction canceled. Max deposit - %3.2f | Your deposit: %3.2f%n", depositLimit, amount);
            return;
        }
        balance += amount;
        System.out.printf("Successfully deposited %3.2f | current account balance: %3.2f%n", amount, balance);
    }

    /**
     * allows the user to decrease the balance
     **/
    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Error - Negative withdraw");
            return;
        }
        if (amount > balance) {
            System.out.println("There is not enough funds.");
            return;
        }
        balance -= amount;
        System.out.printf("Successfully withdrawn %3.2f | current account balance: %3.2f%n", amount, balance);
    }

    /**
     * displays the current balance to user
     **/
    public void printBalance() {
        System.out.printf("Current balance: %3.2f%n", balance);
    }

    /**
     * method for transfer balance from one bank account to another
     **/
    public void transferFunds(BankAccount ba, double amount) {
        if (amount <= 0) {
            System.out.println("Error - Negative amount");
            return;
        }
        if (balance < amount) {
            System.out.printf("Transfer canceled. You are trying to transfer %3.2f units, but only %3.2f are available.%n", amount, balance);
            return;
        }
        this.withdraw(amount);
        ba.deposit(amount);
        System.out.printf("Transaction successful | current account balance: %3.2f%n", balance);
    }

    public double getBalance() {
        return balance;
    }
}
