package org.designpattern.structural.adapter.impl;

import org.designpattern.creational.abstractfactory.impl.Loan;

public class ExternalLoanAdapter implements Loan {

    private ExternalLoanService externalLoanService;

    public ExternalLoanAdapter(ExternalLoanService externalLoanService) {
        this.externalLoanService = externalLoanService;
    }

    @Override
    public double getInterestRate() {
        String result = externalLoanService.getInterestRate();
        if (result != null && isNumeric(result)) {
            return Double.parseDouble(result);
        }
        throw new NumberFormatException("Not able to parse result=" + null);
    }

    @Override
    public double calculateLoanPayment(double loanAmount, int years) {
        String result = externalLoanService.calculateLoanPayment(loanAmount, years);
        if (result != null && isNumeric(result)) {
            return Double.parseDouble(result);
        }
        throw new NumberFormatException("Not able to parse result=" + null);
    }

    public static boolean isNumeric(String str) {
        try {
            Double.parseDouble(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
