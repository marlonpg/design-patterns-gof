package org.designpattern.structural.facade.impl;

public class LoanApprovalService {
    public void approve(String borrowerId, double loanAmount) {
        System.out.println("Loan approved for borrower: " + borrowerId + ", Amount: " + loanAmount);
    }
}
