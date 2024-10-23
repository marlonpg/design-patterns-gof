package org.designpattern.creational.abstractfactory.impl;

import org.designpattern.creational.abstractfactory.enums.LoanType;

public class LoanFactoryImpl implements LoanFactory {

    double businessLoanIntRate = 7.0;
    double personalLoanIntRate = 10.0;

    @Override
    public Loan getLoan(String loanType) {
        if(LoanType.BL.name().equals(loanType)){
            return new BusinessLoan(businessLoanIntRate);
        } else if(LoanType.PL.name().equals(loanType)){
            return new PersonalLoan(personalLoanIntRate);
        }
        throw new RuntimeException("Invalid loanType: " + loanType);
    }
}
