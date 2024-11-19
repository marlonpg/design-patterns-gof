package org.designpattern.structural.facade.impl;

public class LoanEligibilityCalculator {
    public boolean calculateEligibility(String borrowerId, double loanAmount) {
        System.out.println("Calculating loan eligibility for borrower: " + borrowerId + ", Amount: " + loanAmount);
        return loanAmount <= 50000;
    }
}
