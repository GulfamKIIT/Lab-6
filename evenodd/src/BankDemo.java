import java.util.Scanner;


class Account {
    protected static int autoAccNo = 1000;
    protected int accNo;
    protected String name;
    protected String accType;
    protected double balance;
    protected int day, month, year;

    Account(String name, String accType, double balance, int day, int month, int year) {
        this.accNo = ++autoAccNo;
        this.name = name;
        this.accType = accType;
        this.balance = balance;
        this.day = day;
        this.month = month;
        this.year = year;
    }

    void checkBalance() {
        System.out.println("Account No: " + accNo);
        System.out.println("Current Balance: Rs " + balance);
    }

    void deposit(double amount, int d, int m, int y) {
        balance += amount;
        day = d;
        month = m;
        year = y;
        System.out.println("Rs " + amount + " deposited successfully on " +
                day + "/" + month + "/" + year);
    }

    void withdraw(double amount) {
        System.out.println("Withdrawal method of Account class");
    }
}

class StandardAccount extends Account {

    StandardAccount(String name, double balance, int day, int month, int year) {
        super(name, "Standard", balance, day, month, year);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 100000) {
            balance -= amount;
            System.out.println("Rs " + amount + " withdrawn without penalty.");
        } else if (amount <= 500000) {
            double penalty = amount * 0.0005;
            balance -= (amount + penalty);
            System.out.println("Rs " + amount + " withdrawn with penalty Rs " + penalty);
        } else {
            System.out.println("Withdrawal limit exceeded for Standard Account.");
        }
    }
}


class PremiumAccount extends Account {

    PremiumAccount(String name, double balance, int day, int month, int year) {
        super(name, "Premium", balance, day, month, year);
    }

    @Override
    void withdraw(double amount) {
        if (amount <= 1000000) {
            balance -= amount;
            System.out.println("Rs " + amount + " withdrawn successfully (Premium).");
        } else {
            System.out.println("Daily withdrawal limit exceeded for Premium Account.");
        }
    }
}

public class BankDemo {
    public static void main(String[] args) {

        // Dynamic Method Dispatch
        Account acc;

        acc = new StandardAccount("Gulfam", 800000, 1, 1, 2025);
        System.out.println("\n--- Standard Account ---");
        acc.checkBalance();
        acc.deposit(50000, 5, 1, 2025);
        acc.withdraw(200000);
        acc.checkBalance();

        acc = new PremiumAccount("Ayaan", 1500000, 2, 1, 2025);
        System.out.println("\n--- Premium Account ---");
        acc.checkBalance();
        acc.deposit(100000, 6, 1, 2025);
        acc.withdraw(900000);
        acc.checkBalance();
    }
}

