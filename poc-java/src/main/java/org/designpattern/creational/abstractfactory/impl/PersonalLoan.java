package org.designpattern.creational.abstractfactory.impl;

public class PersonalLoan implements Loan {
    private double interestRate;

    public PersonalLoan() {
        this.interestRate = 8.0;
    }

    public PersonalLoan(double interestRate){
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
        System.out.println("Personal Loan result is: " + monthlyPayment);
        return monthlyPayment;
    }
}
