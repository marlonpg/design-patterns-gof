package org.designpattern.creational.singleton;

import org.designpattern.creational.abstractfactory.impl.Loan;

public class Main {
    public static void main(String[] args) {
        LoanFactoryImpl loanFactory = LoanFactoryImpl.getInstance();

        Loan loan = loanFactory.getLoan("PL");

        System.out.println(loan.getInterestRate());
    }
}
