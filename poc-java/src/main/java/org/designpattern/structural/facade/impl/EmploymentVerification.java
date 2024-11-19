package org.designpattern.structural.facade.impl;

public class EmploymentVerification {
    public boolean verifyEmployment(String borrowerId) {
        System.out.println("Verifying employment for borrower: " + borrowerId);
        return true;
    }
}
