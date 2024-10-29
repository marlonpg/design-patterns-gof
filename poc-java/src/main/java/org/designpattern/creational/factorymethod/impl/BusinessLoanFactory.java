package org.designpattern.creational.factorymethod.impl;

import org.designpattern.creational.abstractfactory.impl.BusinessLoan;
import org.designpattern.creational.abstractfactory.impl.Loan;

public class BusinessLoanFactory implements LoanFactory {
    @Override
    public Loan createLoan() {
        return new BusinessLoan();
    }
}