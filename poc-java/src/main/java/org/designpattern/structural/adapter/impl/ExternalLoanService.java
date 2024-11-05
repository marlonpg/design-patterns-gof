package org.designpattern.structural.adapter.impl;

public class ExternalLoanService {

    public String getInterestRate() {
        return "5";
    }

    public String calculateLoanPayment(double loanAmount, int years) {
        return "1234.40";
    }
}
