
package demo.bankaop;

import org.springframework.stereotype.Service;

@Service
public class BankService {

    // Initial bank balance
    private double balance = 1000;

    // Deposit method
    public void deposit(double amount) {

        if (amount <= 0) {

            throw new IllegalArgumentException(
                    "Amount must be positive");

        }

        balance = balance + amount;

        System.out.println(
                "Deposited: " + amount
                + ", balance: " + balance);

    }

    // Withdraw method
    public void withdraw(double amount) {

        if (amount <= 0) {

            throw new IllegalArgumentException(
                    "Amount must be positive");

        }

        if (amount > balance) {

            throw new IllegalArgumentException(
                    "Insufficient balance");

        }

        balance = balance - amount;

        System.out.println(
                "Withdrawn: " + amount
                + ", balance: " + balance);

    }
}
