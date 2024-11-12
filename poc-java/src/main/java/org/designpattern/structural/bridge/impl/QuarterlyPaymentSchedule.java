package org.designpattern.structural.bridge.impl;

public class QuarterlyPaymentSchedule implements PaymentSchedule {

    private Loan loan;

    public QuarterlyPaymentSchedule(Loan loan) {
        this.loan = loan;
    }

    public String showLoanDetails() {
        int quarters = loan.getYears() * 4;
        double quarterlyRate = loan.getInterestRate() / 4 / 100;
        double quarterlyPayment = (loan.getAmount() * quarterlyRate) / (1 - Math.pow(1 + quarterlyRate, -quarters));
        return "Monthly Payment: " + quarterlyPayment;
    }
}
