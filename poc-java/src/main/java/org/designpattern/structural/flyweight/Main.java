package org.designpattern.structural.flyweight;

import org.designpattern.structural.flyweight.impl.LoanFlyweight;
import org.designpattern.structural.flyweight.impl.LoanFlyweightFactory;

public class Main {
    public static void main(String[] args) {
        LoanFlyweight personalLoan1 = LoanFlyweightFactory.getLoanFlyweight("Personal Loan", 7.5, 5);
        LoanFlyweight personalLoan2 = LoanFlyweightFactory.getLoanFlyweight("Personal Loan", 7.5, 5);
        LoanFlyweight homeLoan = LoanFlyweightFactory.getLoanFlyweight("Business Loan", 6.8, 15);

        System.out.println();

        personalLoan1.displayLoanDetails("BORROWER123", 20000);
        personalLoan2.displayLoanDetails("BORROWER456", 30000);
        homeLoan.displayLoanDetails("BORROWER789", 500000);
    }
}
