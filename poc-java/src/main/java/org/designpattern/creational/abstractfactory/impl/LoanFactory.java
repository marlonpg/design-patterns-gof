package org.designpattern.creational.abstractfactory.impl;

public interface LoanFactory {
    public abstract Loan getLoan(String loanType);
}
