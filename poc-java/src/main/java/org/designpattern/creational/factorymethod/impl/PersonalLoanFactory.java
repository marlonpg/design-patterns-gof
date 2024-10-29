package org.designpattern.creational.factorymethod.impl;

import org.designpattern.creational.abstractfactory.impl.Loan;
import org.designpattern.creational.abstractfactory.impl.PersonalLoan;

public class PersonalLoanFactory implements LoanFactory{
    @Override
    public Loan createLoan() {
        return new PersonalLoan();
    }
}
