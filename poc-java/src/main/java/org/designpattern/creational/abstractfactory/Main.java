package org.designpattern.creational.abstractfactory;

import org.designpattern.creational.abstractfactory.impl.Loan;
import org.designpattern.creational.abstractfactory.impl.LoanFactory;
import org.designpattern.creational.abstractfactory.impl.LoanFactoryImpl;

public class Main {
    public static void main(String[] args) {
        LoanFactory loanFactory = new LoanFactoryImpl();
        Loan loan = loanFactory.getLoan("PL");
        System.out.println(loan.calculateLoanPayment(200000.0, 30));

        Loan loanBL = loanFactory.getLoan("BL");
        System.out.println(loanBL.calculateLoanPayment(200000.0, 30));
    }
}
