package org.designpattern.structural.bridge.impl;

public class PersonalLoan implements Loan{
    private double amount;
    private double interestRate;
    private int years;

    public PersonalLoan(double amount, double interestRate, int years) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.years = years;
    }

    @Override
    public double getAmount() {
        return amount;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public int getYears() {
        return years;
    }
}
