package EncapsulationExperiments;

public class ChildBankAccount {
    private double balance;
    private double maxBalance;

    public ChildBankAccount() {
        balance = 0.0;
    }

    public ChildBankAccount(double maxBalance) {
        this.maxBalance = maxBalance;

    }

    public boolean depositMoney(double value) {
        balance = balance + value < maxBalance && value > 0 ? balance + value : balance;
        return true;
    }

    public boolean debitMoney(double value) {
        balance = balance - value > 0 && balance - value < maxBalance && value > 0  ? balance - value : balance;
        return true;
    }
    public double getBalance() {
        return balance;
    }

    }

