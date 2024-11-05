package org.designpattern.creational.singleton;

import org.designpattern.creational.abstractfactory.enums.LoanType;
import org.designpattern.creational.abstractfactory.impl.BusinessLoan;
import org.designpattern.creational.abstractfactory.impl.Loan;
import org.designpattern.creational.abstractfactory.impl.LoanFactory;
import org.designpattern.creational.abstractfactory.impl.PersonalLoan;

public class LoanFactoryImpl implements LoanFactory {
    private double businessLoanIntRate = 7.0;
    private double personalLoanIntRate = 10.0;

    private static final LoanFactoryImpl instance = new LoanFactoryImpl();

    private LoanFactoryImpl() {
        //private constructor to avoid being initialized
    }

    public static LoanFactoryImpl getInstance() {
        return instance;
    }

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
