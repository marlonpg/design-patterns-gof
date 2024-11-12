package org.designpattern.structural.composite.impl;

import java.util.ArrayList;
import java.util.List;

public class LoanPackage implements LoanComponent{
    private List<LoanComponent> loans = new ArrayList<>();

    public void addLoan(LoanComponent loan) {
        loans.add(loan);
    }

    public void removeLoan(LoanComponent loan) {
        loans.remove(loan);
    }

    @Override
    public double calculateMonthlyAmount() {
        double total = 0;
        for (LoanComponent loan : loans) {
            total += loan.calculateMonthlyAmount();
        }
        return total;
    }

    @Override
    public void showDetails() {
        System.out.println("Total monthly payment for Loan packages: " + calculateMonthlyAmount());
    }
}
