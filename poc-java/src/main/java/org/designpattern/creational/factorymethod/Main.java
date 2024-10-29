package org.designpattern.creational.factorymethod;

import org.designpattern.creational.abstractfactory.impl.Loan;
import org.designpattern.creational.factorymethod.impl.BusinessLoanFactory;
import org.designpattern.creational.factorymethod.impl.LoanFactory;
import org.designpattern.creational.factorymethod.impl.PersonalLoanFactory;

public class Main {
    public static void main(String[] args) {
        LoanFactory personalLoanFactory = new PersonalLoanFactory();
        Loan personalLoan = personalLoanFactory.createLoan();
        System.out.println("Personal Loan Payment: " + personalLoan.calculateLoanPayment(50000, 5));

        LoanFactory businessLoanFactory = new BusinessLoanFactory();
        Loan businessLoan = businessLoanFactory.createLoan();
        System.out.println("Business Loan Payment: " + businessLoan.calculateLoanPayment(100000, 10));
    }
}
