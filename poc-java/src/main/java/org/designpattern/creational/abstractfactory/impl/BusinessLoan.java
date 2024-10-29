package org.designpattern.creational.abstractfactory.impl;

public class BusinessLoan implements Loan {
    private double interestRate;

    public BusinessLoan() {
        this.interestRate = 5.0;
    }

    public BusinessLoan(double interestRate){
        this.interestRate = interestRate;
    }

    @Override
    public double getInterestRate() {
        return interestRate;
    }

    @Override
    public double calculateLoanPayment(double loanAmount, int years) {
        double businessFixedIntRate = 10.1;
        double monthlyPayment;
        int numberOfPayments = years * 12;
        double monthlyInterestRate = businessFixedIntRate + interestRate / 12 / 100;

        monthlyPayment = ((monthlyInterestRate * Math.pow((1 + monthlyInterestRate), numberOfPayments))
                / (Math.pow((1 + monthlyInterestRate), numberOfPayments) - 1))
                * loanAmount;
        System.out.println("Business Loan result is: " + monthlyPayment);
        return monthlyPayment;
    }
}