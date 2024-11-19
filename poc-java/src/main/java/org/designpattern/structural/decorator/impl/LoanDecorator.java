package org.designpattern.structural.decorator.impl;

public abstract class LoanDecorator implements Loan {
    protected Loan loan;

    public LoanDecorator(Loan loan) {
        this.loan = loan;
    }

    @Override
    public double calculatePayment() {
        return loan.calculatePayment();
    }

    @Override
    public String getDescription() {
        return loan.getDescription();
    }
}
