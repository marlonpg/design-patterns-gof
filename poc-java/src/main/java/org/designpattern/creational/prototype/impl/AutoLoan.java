package org.designpattern.creational.prototype.impl;

public class AutoLoan implements CloneableLoan{
    private double interestRate;

    public AutoLoan() {
    }

    public AutoLoan(double interestRate) {
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public double calculateLoanPayment(double loanAmount, int years) {
        double monthlyPayment;
        int numberOfPayments = years * 12;
        double monthlyInterestRate = interestRate / 12 / 100;

        monthlyPayment = ((monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayments))
                / (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1))
                * loanAmount;
        System.out.println("Auto Loan result is: " + monthlyPayment);
        return monthlyPayment;
    }

    @Override
    public AutoLoan clone() {
        AutoLoan loan = new AutoLoan(this.interestRate);
        return loan;
    }
}
