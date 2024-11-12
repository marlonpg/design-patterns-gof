package org.designpattern.structural.composite.impl;

public class BusinessLoan implements LoanComponent{
    private double amount;
    private double interestRate;
    private int years;

    public BusinessLoan(double amount, double interestRate, int years) {
        this.amount = amount;
        this.interestRate = interestRate;
        this.years = years;
    }

    public double getAmount() {
        return amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getYears() {
        return years;
    }

    @Override
    public double calculateMonthlyAmount() {
        int months = years * 12;
        double monthlyRate = interestRate / 12 / 100;
        double monthlyPayment = (amount * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));
        return monthlyPayment;
    }

    @Override
    public void showDetails() {

        System.out.println("Monthly Payment for Business: " + calculateMonthlyAmount());
    }
}
