package org.designpattern.structural.facade.impl;

public class CreditCheck {
    public boolean checkCreditHistory(String borrowerId) {
        System.out.println("Checking credit history for borrower: " + borrowerId);
        return true;
    }
}
