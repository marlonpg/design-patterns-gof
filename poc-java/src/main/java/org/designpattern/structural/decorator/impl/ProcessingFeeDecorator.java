package org.designpattern.structural.decorator.impl;

public class ProcessingFeeDecorator extends LoanDecorator {
    private double processingFee;

    public ProcessingFeeDecorator(Loan loan, double processingFee) {
        super(loan);
        this.processingFee = processingFee;
    }

    @Override
    public double calculatePayment() {
        return super.calculatePayment() + processingFee;
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + Processing Fee";
    }
}