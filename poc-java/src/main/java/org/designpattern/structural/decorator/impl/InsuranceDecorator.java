package org.designpattern.structural.decorator.impl;

public class InsuranceDecorator extends LoanDecorator {
    private double insuranceCost;

    public InsuranceDecorator(Loan loan, double insuranceCost) {
        super(loan);
        this.insuranceCost = insuranceCost;
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() + insuranceCost;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Insurance";
    }
}