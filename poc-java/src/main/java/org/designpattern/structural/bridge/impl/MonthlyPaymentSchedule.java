package org.designpattern.structural.bridge.impl;

public class MonthlyPaymentSchedule implements PaymentSchedule {

    private Loan loan;

    public MonthlyPaymentSchedule(Loan loan) {
        this.loan = loan;
    }

    public String showLoanDetails() {
        int months = loan.getYears() * 12;
        double monthlyRate = loan.getInterestRate() / 12 / 100;
        double monthlyPayment = (loan.getAmount() * monthlyRate) / (1 - Math.pow(1 + monthlyRate, -months));
        return "Monthly Payment: " + monthlyPayment;
    }
}
