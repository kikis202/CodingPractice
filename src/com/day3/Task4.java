package com.day3;

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

public class Task4 {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount();
        BankAccount friendsAccount = new BankAccount(1500);

        myAccount.deposit(5500);
        myAccount.deposit(500);
        myAccount.withdraw(550);
        myAccount.printBalance();

        System.out.println();
        myAccount.transferFunds(friendsAccount,4000);
        myAccount.transferFunds(friendsAccount, -200);
    }
}
