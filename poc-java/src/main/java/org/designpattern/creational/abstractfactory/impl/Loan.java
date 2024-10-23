package org.designpattern.creational.abstractfactory.impl;

public interface Loan {
    double getInterestRate();
    double calculateLoanPayment(double loanAmount, int years);
}
