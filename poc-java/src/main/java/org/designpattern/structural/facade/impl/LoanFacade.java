package org.designpattern.structural.facade.impl;

public class LoanFacade {
    private CreditCheck creditCheck;
    private EmploymentVerification employmentVerification;
    private LoanEligibilityCalculator eligibilityCalculator;
    private LoanApprovalService loanApproval;

    public LoanFacade() {
        this.creditCheck = new CreditCheck();
        this.employmentVerification = new EmploymentVerification();
        this.eligibilityCalculator = new LoanEligibilityCalculator();
        this.loanApproval = new LoanApprovalService();
    }

    public void applyForLoan(String borrowerId, double loanAmount) {
        System.out.println("Starting loan application process for borrower: " + borrowerId);

        if (!creditCheck.checkCreditHistory(borrowerId)) {
            System.out.println("Loan application failed: Bad credit history.");
            return;
        }

        if (!employmentVerification.verifyEmployment(borrowerId)) {
            System.out.println("Loan application failed: Employment verification failed.");
            return;
        }

        if (!eligibilityCalculator.calculateEligibility(borrowerId, loanAmount)) {
            System.out.println("Loan application failed: Not eligible for the loan amount.");
            return;
        }

        loanApproval.approve(borrowerId, loanAmount);
        System.out.println("Loan application process completed successfully.");
    }
}
