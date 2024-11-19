package org.designpattern.structural.decorator.impl;

public class BaseLoan implements Loan {
    private double amount;
    private double interestRate;

    public BaseLoan(double amount, double interestRate) {
        this.amount = amount;
        this.interestRate = interestRate;
    }

    @Override
    public double calculatePayment() {
        return (amount / 12) * interestRate;
    }

    @Override
    public String getDescription() {
        return "Base Loan";
    }
}
