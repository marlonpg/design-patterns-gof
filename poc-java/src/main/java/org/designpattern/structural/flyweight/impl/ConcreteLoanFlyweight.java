package org.designpattern.structural.flyweight.impl;

public class ConcreteLoanFlyweight implements LoanFlyweight {
    private final String loanType;
    private final double interestRate;
    private final int term;

    public ConcreteLoanFlyweight(String loanType, double interestRate, int term) {
        this.loanType = loanType;
        this.interestRate = interestRate;
        this.term = term;
    }

    @Override
    public void displayLoanDetails(String borrowerId, double loanAmount) {
        System.out.println("Loan Details:");
        System.out.println("Borrower ID: " + borrowerId);
        System.out.println("Loan Type: " + loanType);
        System.out.println("Loan Amount: " + loanAmount);
        System.out.println("Interest Rate: " + interestRate);
        System.out.println("Term: " + term + " years");
    }
}
