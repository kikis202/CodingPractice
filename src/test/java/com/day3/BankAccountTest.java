package com.day3;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankAccountTest {

    BankAccount account = null;

    @BeforeEach
    void setUp() {
        account = new BankAccount(1000);
    }

    @Test
    void getBalance() {
        assertEquals(1000, account.getBalance());
    }

    @Test
    void deposit() {
        account.deposit(1000);
        assertEquals(2000, account.getBalance());
    }

    @Test
    void withdraw() {
        account.withdraw(500);
        assertEquals(500, account.getBalance());
    }

    @Test
    void transferFunds() {
        BankAccount account2 = new BankAccount(2000);
        account.transferFunds(account2, 500);
        assertAll(() -> assertEquals(500, account.getBalance()),
                () -> assertEquals(2500, account2.getBalance()));
    }
}