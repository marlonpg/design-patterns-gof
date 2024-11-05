package org.designpattern.creational.prototype;

import org.designpattern.creational.prototype.impl.AutoLoan;

public class Main {
    public static void main(String[] args) {
        AutoLoan loan = new AutoLoan(33);
        System.out.println("Auto Loan 1 Payment: " + loan.calculateLoanPayment(50000, 5));

        AutoLoan loan2 = loan.clone();
        System.out.println("Auto Loan 2 Payment: " + loan2.calculateLoanPayment(100000, 10));
    }
}
